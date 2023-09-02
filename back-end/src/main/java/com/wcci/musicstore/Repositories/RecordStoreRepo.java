package com.wcci.musicstore.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcci.musicstore.Models.RecordStore;

public interface RecordStoreRepo extends JpaRepository<RecordStore, Long> {
    List<RecordStore> findByName(String name);
}
