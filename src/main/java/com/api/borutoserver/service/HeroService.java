package com.api.borutoserver.service;

import com.api.borutoserver.models.ApiResponse;
import com.api.borutoserver.models.Hero;

public interface HeroService {

    ApiResponse getAllHeroes();
    ApiResponse createHero(Hero hero);

}
