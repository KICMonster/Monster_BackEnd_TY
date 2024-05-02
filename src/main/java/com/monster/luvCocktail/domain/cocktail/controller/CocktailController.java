package com.monster.luvCocktail.domain.cocktail.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.luvCocktail.domain.cocktail.dto.CreateCocktailRequest;
import com.monster.luvCocktail.domain.cocktail.dto.CreateCocktailResponse;
import com.monster.luvCocktail.domain.cocktail.service.CocktailService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cocktail")
public class CocktailController {

	private final CocktailService cocktailService;
	
	// 이런식으로 처리하시면 됩니다 ( 에러처리는 서비스에서 할지 컨트롤러에서 할지 같이 의논을 해봐야할것 같네요 )
	@PostMapping("/create")
	public ResponseEntity<CreateCocktailResponse> create(@RequestBody CreateCocktailRequest request) {
		return ResponseEntity.ok(cocktailService.create(request));
	}
}
