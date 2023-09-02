package com.wcci.musicstore.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Beatles extends SuperArtist {

    @ManyToOne
    @JoinColumn(name = "record_store_id")
    private RecordStore recordStore;

    private int rating;
    private int numOfSongs;
    private boolean isInHOF;

    public Beatles() {
    }

    public Beatles(String name, String description) {
        super(name, description, false, 10);
    }

    public RecordStore getRecordStore() {
        return this.recordStore;
    }

    public void setRecordStore(RecordStore recordStore) {
        this.recordStore = recordStore;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNumOfSongs() {
        return this.numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public boolean isIsInHOF() {
        return this.isInHOF;
    }

    public boolean getIsInHOF() {
        return this.isInHOF;
    }

    public void setIsInHOF(boolean isInHOF) {
        this.isInHOF = isInHOF;
    }

}
