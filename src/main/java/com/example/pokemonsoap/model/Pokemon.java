package com.example.pokemonsoap.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    @JsonProperty("abilities")
    private List<Ability> abilities;

    @JsonProperty("base_experience")
    private int baseExperience;

    @JsonProperty("held_items")
    private List<HeldItem> heldItems;

    private int id;

    private String name;

    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
}
