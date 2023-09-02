package com.wcci.musicstore.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public Employee() {
        this.recordStores = new ArrayList<>();
    }

    public Employee(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(name = "record_store_employee", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "record_store_id"))
    private List<RecordStore> recordStores = new ArrayList<>();

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RecordStore> getRecordStores() {
        return this.recordStores;
    }

    public void setRecordStores(List<RecordStore> recordStores) {
        this.recordStores = recordStores;
    }

}
