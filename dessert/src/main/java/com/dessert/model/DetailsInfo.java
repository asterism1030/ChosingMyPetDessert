package com.dessert.model;

import com.dessert.constval.EnumClass.DessertType;

public abstract class DetailsInfo {
	String name;
	int price;
	
	DessertType dessertType;
	
	float calorie;
	
	float natrium;	// 나트륨
	float sugar;	// 당
	float carb;		// 탄수화물
	float protein;	// 단백질
	float fat;		// 지방
	float transFat;	// 트랜스 지방
	
	// method
	
	
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
		if(this.price >= 0)
			this.price = price;
		else
			this.price = 0;
	}
	public float getCalorie() {
		return calorie;
	}
	public void setCalorie(float calorie) {
		if(this.calorie >= 0)
			this.calorie = calorie;
		else
			this.calorie = 0;
	}
	public float getNatrium() {
		return natrium;
	}
	public void setNatrium(float natrium) {
		if(this.natrium >= 0)
			this.natrium = natrium;
		else
			this.natrium = 0;
	}
	public float getSugar() {
		return sugar;
	}
	public void setSugar(float sugar) {
		if(this.sugar >= 0)
			this.sugar = sugar;
		else
			this.sugar = 0;
	}
	public float getCarb() {
		return carb;
	}
	public void setCarb(float carb) {
		if(this.carb >= 0)
			this.carb = carb;
		else
			this.carb = 0;
	}
	public float getProtein() {
		return protein;
	}
	public void setProtein(float protein) {
		if(this.protein >= 0)
			this.protein = protein;
		else
			this.protein = 0;
	}
	public float getFat() {
		return fat;
	}
	public void setFat(float fat) {
		if(this.fat >= 0)
			this.fat = fat;
		else
			this.fat = 0;
	}
	public float getTransFat() {
		return transFat;
	}
	public void setTransFat(float transFat) {
		if(this.transFat >= 0)
			this.transFat = transFat;
		else
			this.transFat = 0;
	}
	
	
	
}
