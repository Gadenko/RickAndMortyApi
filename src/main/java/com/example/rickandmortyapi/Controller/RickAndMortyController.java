package com.example.rickandmortyapi.Controller;

import com.example.rickandmortyapi.RickAndMortyModel.RMCharacter;
import com.example.rickandmortyapi.Service.RMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("character")
public class RickAndMortyController {

    private final RMService rmService;
    @Autowired
    public RickAndMortyController(RMService rmService) {
        this.rmService = rmService;
    }

    @GetMapping
    public List<RMCharacter> getAllCharacters(){
        return rmService.getAllCharacters();
    }

}
