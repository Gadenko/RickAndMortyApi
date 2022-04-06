package com.example.rickandmortyapi.Service;

import com.example.rickandmortyapi.API.ApiService;
import com.example.rickandmortyapi.RickAndMortyModel.RMCharacter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RMService {

    private final ApiService apiService;

    public RMService(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<RMCharacter> getAllCharacters(){
        return apiService.getAllCharacters();
    }
}
