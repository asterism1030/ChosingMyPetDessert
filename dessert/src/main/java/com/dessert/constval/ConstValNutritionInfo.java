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
	public static int maxPrice = 50000; 		// 50000 ~

	public static float maxCalorie = 2000; 	// 2000 ~

	public static float maxNatrium = 10.0f; 	// 나트륨
	public static float maxSugar = 50; 		// 당
	public static float maxCarb = 500; 		// 탄수화물
	public static float maxProtein = 500; 	// 단백질
	public static float maxFat = 500; 		// 지방
	public static float maxTransFat = 100; 	// 트랜스 지방
	
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
