package com.example.rickandmortyapi.RickAndMortyModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RMCharacterInfo {

    private List<RMCharacter> results;


}
