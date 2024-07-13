package com.example.pokemonsoap.service;

import com.example.pokemonsoap.model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Pokemon getPokemonData(String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        return restTemplate.getForObject(url, Pokemon.class);
    }
}
