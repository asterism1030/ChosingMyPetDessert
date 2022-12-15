package com.dessert.view;

import java.util.List;

import com.dessert.DetailsInfo;
import com.dessert.model.DessertInfo;
import com.dessert.model.FilterInfo;
import com.dessert.model.UserInfo;

public class MainPage {
	//// body
	// left
	// 로그인 / 아웃
	UserInfo user;
	boolean isLogIn;
	
	// 필터 슬라이더바
	FilterInfo filterInfo;
	
	// center
	List<DessertInfo> desserts;
	
	// right
	// 장바구니 목록
	List<DessertInfo> selectedDesserts;
	DetailsInfo totalInfo;		// 선택한 음식들의 총 합 계산 - 가격, 칼로리, 나트륨 등등..
	DetailsInfo totalPerInfo;	// 하루 권장량에 따른 퍼센트 총 합
	
}
