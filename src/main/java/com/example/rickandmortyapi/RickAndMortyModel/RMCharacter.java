package com.example.rickandmortyapi.RickAndMortyModel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RMCharacter {

    private String name;
    private String id;
    private String status;

}
