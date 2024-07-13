package com.example.pokemonsoap.service;

import com.example.pokemonsoap.model.Pokemon;
import com.example.pokemonsoap.model.PokemonResponse;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    public PokemonResponse getPokemonData(String name) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(name);
        pokemon.setType("Water"); // Ejemplo de tipo

        PokemonResponse response = new PokemonResponse();
        response.setPokemon(pokemon);

        return response;
    }
}
