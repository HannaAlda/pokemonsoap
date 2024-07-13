package com.example.pokemonsoap.controller;

import com.example.pokemonsoap.model.PokemonRequest;
import com.example.pokemonsoap.model.PokemonResponse;
import com.example.pokemonsoap.service.PokemonService;
import com.example.pokemonsoap.service.RequestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.servlet.http.HttpServletRequest;

@Endpoint
public class PokemonSoapController {

    private static final String NAMESPACE_URI = "http://example.com/pokemon";

    @Autowired
    private PokemonService pokemonService;

    @Autowired
    private RequestLogService requestLogService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PokemonRequest")
    @ResponsePayload
    public PokemonResponse getPokemonData(@RequestPayload PokemonRequest request, HttpServletRequest httpRequest) {
        requestLogService.logRequest(httpRequest.getRemoteAddr(), "getPokemonData");
        return pokemonService.getPokemonData(request.getName());
    }
}
