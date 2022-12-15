package com.dessert;

public abstract class DetailsInfo {
	String name;
	int price;
	
	float calorie;
	
	float natrium;	// 나트륨
	float sugar;	// 당
	float carb;		// 탄수화물
	float protein;	// 단백질
	float fat;		// 지방
	float transFat;	// 트랜스 지방
	
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getCalorie() {
		return calorie;
	}
	public void setCalorie(float calorie) {
		this.calorie = calorie;
	}
	public float getNatrium() {
		return natrium;
	}
	public void setNatrium(float natrium) {
		this.natrium = natrium;
	}
	public float getSugar() {
		return sugar;
	}
	public void setSugar(float sugar) {
		this.sugar = sugar;
	}
	public float getCarb() {
		return carb;
	}
	public void setCarb(float carb) {
		this.carb = carb;
	}
	public float getProtein() {
		return protein;
	}
	public void setProtein(float protein) {
		this.protein = protein;
	}
	public float getFat() {
		return fat;
	}
	public void setFat(float fat) {
		this.fat = fat;
	}
	public float getTransFat() {
		return transFat;
	}
	public void setTransFat(float transFat) {
		this.transFat = transFat;
	}
	
	
	
}
