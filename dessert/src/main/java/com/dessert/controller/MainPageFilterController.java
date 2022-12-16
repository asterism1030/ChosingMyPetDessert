package com.dessert.controller;

import com.dessert.model.FilterInfo;

public class MainPageFilterController {
	
	public boolean filterApplyBtnClicked(FilterInfo filterInfo) {
		boolean isSuccess = true;
		// TODO) 필터 값에 따라 필터링된 아이템을 띄우도록 화면 갱신
		
		
		return isSuccess;
	}
	
	// 사용자가 화면에서 필터 조작 시 값 적용
	public FilterInfo setPriceUser(int price, FilterInfo filterInfo) {
		filterInfo.setPrice(price);
		return filterInfo;
	}
	
	public FilterInfo setCalorieUser(int calorie, FilterInfo filterInfo) {
		filterInfo.setCalorie(calorie);
		return filterInfo;
	}
	
	public FilterInfo setNatriumUser(int natrium, FilterInfo filterInfo) {
		filterInfo.setNatrium(natrium);
		return filterInfo;
	}
	
	public FilterInfo setSugarUser(int sugar, FilterInfo filterInfo) {
		filterInfo.setSugar(sugar);
		return filterInfo;
	}
	
	public FilterInfo setCarbUser(int carb, FilterInfo filterInfo) {
		filterInfo.setCarb(carb);
		return filterInfo;
	}
	
	public FilterInfo setProteinUser(int protein, FilterInfo filterInfo) {
		filterInfo.setProtein(protein);
		return filterInfo;
	}
	
	public FilterInfo setFatUser(int fat, FilterInfo filterInfo) {
		filterInfo.setFat(fat);
		return filterInfo;
	}

	public FilterInfo setTransFatUser(int transFat, FilterInfo filterInfo) {
		filterInfo.setTransFat(transFat);
		return filterInfo;
	}
	
}
