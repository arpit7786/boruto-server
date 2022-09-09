package com.api.borutoserver.converter;

import com.api.borutoserver.entity.HeroEntity;
import com.api.borutoserver.models.Hero;
import org.springframework.stereotype.Component;

@Component
public class HeroConverter {

    public HeroEntity convertModelToEntity(Hero hero) {

        HeroEntity heroEntity = new HeroEntity();
        heroEntity.setAbilities(hero.getAbilities());
        heroEntity.setAbout(hero.getAbout());
        heroEntity.setDay(hero.getDay());
        heroEntity.setFamily(hero.getFamily());
        heroEntity.setId(hero.getId());
        heroEntity.setImage(hero.getImage());
        heroEntity.setMonth(hero.getMonth());
        heroEntity.setName(hero.getName());
        heroEntity.setNatureTypes(hero.getNatureTypes());
        heroEntity.setPower(hero.getPower());
        heroEntity.setRating(hero.getRating());

        return heroEntity;
    }

    public Hero convertEntityToModel(HeroEntity heroEntity) {

        Hero hero = new Hero();
        hero.setAbilities(heroEntity.getAbilities());
        hero.setAbout(heroEntity.getAbout());
        hero.setDay(heroEntity.getDay());
        hero.setFamily(heroEntity.getFamily());
        hero.setImage(heroEntity.getImage());
        hero.setMonth(heroEntity.getMonth());
        hero.setId(heroEntity.getId());
        hero.setName(heroEntity.getName());
        hero.setPower(heroEntity.getPower());
        hero.setNatureTypes(heroEntity.getNatureTypes());
        hero.setRating(heroEntity.getRating());

        return hero;
    }

}
