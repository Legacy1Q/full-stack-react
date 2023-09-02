package com.wcci.musicstore.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.musicstore.Models.Beatles;
import com.wcci.musicstore.Repositories.BeatlesRepo;

@RestController
@RequestMapping("/beatles")
@CrossOrigin(origins = "http://localhost:5173")
public class BeatlesController {
    @Autowired
    private BeatlesRepo beatlesRepo;

    @GetMapping("/name/{name}")
    public List<Beatles> getBeatlesByName(@PathVariable String name) {
        return beatlesRepo.findByName(name);
    }

    @GetMapping("/all")
    public List<Beatles> getAllBeatles() {
        return beatlesRepo.findAll();
    }

}
