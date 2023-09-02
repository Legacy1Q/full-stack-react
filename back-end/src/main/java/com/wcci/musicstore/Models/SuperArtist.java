package com.wcci.musicstore.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class SuperArtist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private boolean onTour;
    private int musicalSkill;

    public SuperArtist() {
    }

    public SuperArtist(String name, String description, boolean onTour, int musicalSkill) {
        this.name = name;
        this.description = description;
        this.onTour = onTour;
        this.musicalSkill = musicalSkill;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOnTour() {
        return this.onTour;
    }

    public boolean getOnTour() {
        return this.onTour;
    }

    public void setOnTour(boolean onTour) {
        this.onTour = onTour;
    }

    public int getMusicalSkill() {
        return this.musicalSkill;
    }

    public void setMusicalSkill(int musicalSkill) {
        this.musicalSkill = musicalSkill;
    }

}
