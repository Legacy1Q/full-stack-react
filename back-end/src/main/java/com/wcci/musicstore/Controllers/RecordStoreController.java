package com.wcci.musicstore.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.musicstore.Models.RecordStore;
import com.wcci.musicstore.Repositories.RecordStoreRepo;

@RestController
@RequestMapping("/recordstore")
public class RecordStoreController {
    @Autowired
    private RecordStoreRepo recordStoreRepo;

    // This is for testing
    @GetMapping("/{id}")
    public RecordStore getRecordStoreById(@PathVariable Long id) {
        return recordStoreRepo.findById(id).orElse(null);
    }

    @GetMapping("/name/{name}")
    public List<RecordStore> getRecordStoreByName(@PathVariable String name) {
        return recordStoreRepo.findByName(name);
    }
}
