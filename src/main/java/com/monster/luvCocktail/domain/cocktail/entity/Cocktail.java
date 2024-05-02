package com.monster.luvCocktail.domain.cocktail.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(
		name="Cocktail_SEQ_GENERATOR",
		sequenceName = "Cocktail,SEQ",
		initialValue = 1, allocationSize = 1
		)
public class Cocktail {

	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY,
			generator = "Cocktail_SEQ_GENERATOR"
			)
	private Long id;
	
	private String detail;
	
	private String image;
	
	
}
