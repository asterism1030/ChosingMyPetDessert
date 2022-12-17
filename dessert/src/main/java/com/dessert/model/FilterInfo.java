package com.dessert.model;

import com.dessert.constval.ConstValNutritionInfo;

public class FilterInfo extends DetailsInfo {
	// 아래의 max와 사용자가 지정한 DetailsInfo의 값을 비교하여 ratio 를 설정
	public float getPriceRatio() {
		return getPrice() / ConstValNutritionInfo.maxPrice * 100;
	}
	
	public float getCalorieRatio() {
		return getCalorie() / ConstValNutritionInfo.maxCalorie * 100;
	}
	
	public float getNatriumRatio() {
		return getNatrium() / ConstValNutritionInfo.maxNatrium * 100;
	}
	
	public float getSugarRatio() {
		return getSugar() / ConstValNutritionInfo.maxSugar * 100;
	}
	
	public float getCarbRatio() {
		return getCarb() / ConstValNutritionInfo.maxCarb * 100;
	}
	
	public float getProteinRatio() {
		return getProtein() / ConstValNutritionInfo.maxProtein * 100;
	}
	
	public float getFatRatio() {
		return getFat() / ConstValNutritionInfo.maxFat * 100;
	}
}
