package com.monster.luvCocktail.domain.cocktail.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monster.luvCocktail.domain.cocktail.dto.CreateCocktailRequest;
import com.monster.luvCocktail.domain.cocktail.dto.CreateCocktailResponse;
import com.monster.luvCocktail.domain.cocktail.entity.Cocktail;
import com.monster.luvCocktail.domain.cocktail.repository.CocktailRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CocktailServiceImpl implements CocktailService {

	private final CocktailRepository cocktailRepository;
	
	@Override
	@Transactional
	public CreateCocktailResponse create(CreateCocktailRequest request) {
		
		/*
		 * 칵테일을 생성하기 전에 처리할 로직 처리
		 */
		
		// 엔티티 생성
		Cocktail cocktail = new Cocktail();
		
		// request 자료를 엔티티에 매핑
//		mapping(request,cocktail);
		
		// DB에 칵테일 엔티티 저장
		cocktailRepository.save(cocktail);
		
		// response DTO 반환
		CreateCocktailResponse response = new CreateCocktailResponse();
		
		// response DTO 에 직접 매핑하셔도 되고, 생성자로 넣으셔도 상관없어요
		
		return response;
	}

}
