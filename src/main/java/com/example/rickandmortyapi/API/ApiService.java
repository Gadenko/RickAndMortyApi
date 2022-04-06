package com.example.rickandmortyapi.API;

import com.example.rickandmortyapi.RickAndMortyModel.RMCharacter;
import com.example.rickandmortyapi.RickAndMortyModel.RMCharacterInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Service
public class ApiService {


    public WebClient webClient;
    @Autowired
    public ApiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<RMCharacter> getAllCharacters() {
        RMCharacterInfo charactersInfo = webClient.get()
                .uri("/character")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(RMCharacterInfo.class)
                .block()
                .getBody();


        return charactersInfo.getResults();
    }

}
