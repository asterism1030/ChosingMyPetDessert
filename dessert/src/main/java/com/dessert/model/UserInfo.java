package com.dessert.model;

import java.util.Date;
import com.dessert.RecommandNutritions;

public class UserInfo {
	String name;
	
	Date birth;
	float weight;
	
	RecommandNutritions recommandNutritions;

	public UserInfo(String name, Date birth, float weight, RecommandNutritions recommandNutritions) {
		super();
		
		this.name = name;
		this.birth = birth;
		this.weight = weight;
		this.recommandNutritions = recommandNutritions;
	}
	
	
}
