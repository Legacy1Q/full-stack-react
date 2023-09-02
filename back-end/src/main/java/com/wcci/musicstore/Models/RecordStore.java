package com.wcci.musicstore.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class RecordStore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public RecordStore() {
    }

    public RecordStore(String name) {
        this.name = name;
    }

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

    // Come back to this later after setting up
    // Beatles, Employees, RecordStore, SuperArtist
    // Establish One to Many Relationships
    @OneToMany(mappedBy = "recordStore")
    private List<Beatles> beatles = new ArrayList<>();

    // Complete the Many to Many
    @ManyToMany(mappedBy = "recordStores")
    private List<Employee> employees = new ArrayList<>();

}
