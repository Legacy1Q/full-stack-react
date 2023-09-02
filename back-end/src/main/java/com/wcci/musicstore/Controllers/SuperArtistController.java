package com.wcci.musicstore.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.musicstore.Models.SuperArtist;
import com.wcci.musicstore.Repositories.SuperArtistRepo;

@RestController
@RequestMapping("/superartist")
public class SuperArtistController {

    @Autowired
    private SuperArtistRepo superArtistRepository;

    @GetMapping("/{id}")
    public SuperArtist getSuperArtistById(@PathVariable long id) {
        return superArtistRepository.findById(id).orElse(null);
    }
}
