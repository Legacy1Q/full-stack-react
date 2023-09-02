package com.wcci.musicstore.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcci.musicstore.Models.Beatles;

public interface BeatlesRepo extends JpaRepository<Beatles, Long> {
    List<Beatles> findByName(String name);
}
