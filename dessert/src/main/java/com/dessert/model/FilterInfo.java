package com.dessert.model;

public class FilterInfo extends DetailsInfo {
	// 사용자가 지정한 필터 정보
	
	int maxPrice = 50000; 		// 50000 ~

	float maxCalorie = 2000; 	// 2000 ~

	float maxNatrium = 10.0f; 	// 나트륨
	float maxSugar = 50; 		// 당
	float maxCarb = 500; 		// 탄수화물
	float maxProtein = 500; 	// 단백질
	float maxFat = 500; 		// 지방
	float maxTransFat = 100; 	// 트랜스 지방

	// 아래의 max와 사용자가 지정한 DetailsInfo의 값을 비교하여 ratio 를 설정
	public float getPriceRatio() {
		return getPrice() / maxPrice * 100;
	}
	
	public float getCalorieRatio() {
		return getCalorie() / maxCalorie * 100;
	}
	
	public float getNatriumRatio() {
		return getNatrium() / maxNatrium * 100;
	}
	
	public float getSugarRatio() {
		return getSugar() / maxSugar * 100;
	}
	
	public float getCarbRatio() {
		return getCarb() / maxCarb * 100;
	}
	
	public float getProteinRatio() {
		return getProtein() / maxProtein * 100;
	}
	
	public float getFatRatio() {
		return getFat() / maxFat * 100;
	}
	
	public float getTransFatRatio() {
		return getTransFat() / maxTransFat * 100;
	}
}
