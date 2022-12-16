package com.dessert.constval;

import java.util.List;
import com.dessert.constval.EnumClass.PersonType;
import com.dessert.model.RecommandNutritions;

public class ConstValNutritionInfo {
	// SingleTone
	private static ConstValNutritionInfo inst = null;
	
	public static ConstValNutritionInfo getInst() {
		if (inst == null) {
			inst = new ConstValNutritionInfo();
		}
		return inst;
	}
	
	// constructor
	public ConstValNutritionInfo() {
		super();
		
		nutritionInfo[0] = new RecommandNutritions();
		nutritionInfo[1] = new RecommandNutritions();
		nutritionInfo[2] = new RecommandNutritions();
		nutritionInfo[3] = new RecommandNutritions();
	}

	
	// 변수들
	RecommandNutritions[] nutritionInfo = new RecommandNutritions[4];
	
	// method
	public RecommandNutritions getPersonRecommandNutritionInfo(PersonType personType) {
		switch(personType) {
		case ADULTWOMAN:
			return nutritionInfo[0];
		case YOUNGWOMAN:
			return nutritionInfo[1];
		case ADULTMAN:
			return nutritionInfo[2];
		case YOUNGMAN:
			return nutritionInfo[3];
		}
		
		return null;
	}

	// getter / setter
	public void setNutritionInfo(RecommandNutritions nutritionInfo, int index) {
		this.nutritionInfo[index] = nutritionInfo;
	}
	
}
