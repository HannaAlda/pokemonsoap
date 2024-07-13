package com.example.pokemonsoap.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    private String abilities;
    private String baseExperience;
    private String heldItems;
    private String id;
    private String name;
    private String locationAreaEncounters;
}
