package com.api.borutoserver.repository;

import com.api.borutoserver.entity.HeroEntity;
import org.springframework.data.repository.CrudRepository;

public interface HeroRepository extends CrudRepository<HeroEntity, Integer> {
}
