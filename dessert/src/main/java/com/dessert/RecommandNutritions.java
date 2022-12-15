package com.dessert;

// TODO ) singletone 하는게 좋겠으나 스프링에 있을것같음 팩토리 만들고 너무 시간 걸리니까 보류, UserInfo 에서 들고 있게 했으니까 나중에 지워야함
public class RecommandNutritions extends DetailsInfo {
	// 하루 성인 여성 기준
	public RecommandNutritions() {
		super();
		
		calorie = 2000;
		natrium = 1.5f;		// 나트륨
		sugar = 25;			// 당
		carb = 130;			// 탄수화물
		protein = 55;		// 단백질
		fat = 66.7f;		// 지방
		transFat = 15;		// 트랜스 지방
	}
	
}
