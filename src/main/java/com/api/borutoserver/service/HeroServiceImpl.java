package com.api.borutoserver.service;

import com.api.borutoserver.converter.HeroConverter;
import com.api.borutoserver.entity.HeroEntity;
import com.api.borutoserver.models.ApiResponse;
import com.api.borutoserver.models.Hero;
import com.api.borutoserver.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService{

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private HeroConverter heroConverter;

    @Autowired
    private ApiResponse apiResponse;

    @Override
    public ApiResponse getAllHeroes() {

        List<HeroEntity> heroesEntity = (List<HeroEntity>) heroRepository.findAll();
        List<Hero> heroes = new ArrayList<>();
        for (HeroEntity heroEntity: heroesEntity) {
            heroes.add(heroConverter.convertEntityToModel(heroEntity));
        }

        apiResponse.setHeroes(heroes);
        apiResponse.setMessage("ok");
        apiResponse.setSuccess(true);

        return apiResponse;
    }

    @Override
    public ApiResponse createHero(Hero hero) {

        List<Hero> heroes = new ArrayList<>();

        HeroEntity heroEntity = heroConverter.convertModelToEntity(hero);
        heroEntity = heroRepository.save(heroEntity);
        Hero hero1 = heroConverter.convertEntityToModel(heroEntity);

        heroes.add(hero1);

        apiResponse.setHeroes(heroes);
        apiResponse.setMessage("ok");
        apiResponse.setSuccess(true);

        return apiResponse;
    }
}
