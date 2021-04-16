package com.digitalinnovation.livecoding.repository;

// camada de acesso a model

import com.digitalinnovation.livecoding.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String> {
}
