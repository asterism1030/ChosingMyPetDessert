package com.dessert.model;

// TODO ) singletone 하는게 좋겠으나 스프링에 있을것같음 팩토리 만들고 너무 시간 걸리니까 보류, UserInfo 에서 들고 있게 했으니까 나중에 지워야함
public class RecommandNutritions extends DetailsInfo {
	// 하루 성인 여성 기준
	public RecommandNutritions() {
		super();
		
		setCalorie(2000);
		setNatrium(1.5f);
		setSugar(25);
		setCarb(130);
		setProtein(55);
		setFat(66.7f);
		setTransFat(15);
	}
	
	public RecommandNutritions(float calorie, float natrium, float sugar, float carb, float protein, float fat, float transFat) {
		super();
		
		setCalorie(calorie);
		setNatrium(natrium);
		setSugar(sugar);
		setCarb(carb);
		setProtein(protein);
		setFat(fat);
		setTransFat(transFat);
	}
	
}
