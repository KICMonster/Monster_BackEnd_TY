package com.monster.luvCocktail.domain.cocktail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monster.luvCocktail.domain.cocktail.entity.Cocktail;

public interface CocktailRepository extends JpaRepository<Cocktail, Long>{

}
