package com.api.borutoserver.controller;

import com.api.borutoserver.models.ApiResponse;
import com.api.borutoserver.models.Hero;
import com.api.borutoserver.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ApiResponseController {

    @Autowired
    private HeroService heroService;

    @GetMapping("/heroes")
    public ResponseEntity<ApiResponse> getAllHeroes(){

        ApiResponse apiResponse = heroService.getAllHeroes();

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("/heroes/{heroId}")
    public ResponseEntity<ApiResponse> insertHero(@RequestBody Hero hero, @PathVariable Integer heroId) {

        ApiResponse apiResponse = heroService.createHero(hero);

        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);

    }

}
