package com.dessert.view;

import java.util.List;

import com.dessert.model.DessertInfo;
import com.dessert.model.UserInfo;

public class MainPage {
	UserInfo user;
	List<DessertInfo> desserts;
	
	// 이 페이지에서 유저가 설정한 필터
	float calorie;
	
	float natrium;	// 나트륨
	float sugar;	// 당
	float carb;		// 탄수화물
	float protein;	// 단백질
	float fat;		// 지방
}
