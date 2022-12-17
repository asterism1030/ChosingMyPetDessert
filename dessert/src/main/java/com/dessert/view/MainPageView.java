package com.dessert.view;

import java.util.List;

import com.dessert.model.DessertInfo;
import com.dessert.model.DetailsInfo;
import com.dessert.model.FilterInfo;
import com.dessert.model.UserInfo;

// SingleTone
public class MainPageView {
	// SingleTone
	private static MainPageView inst = null;
	public static MainPageView getInst() {
		if (inst == null) {
			inst = new MainPageView();
		}
		return inst;
	}
	
	//// body
	// left
	// 로그인 / 아웃
	public boolean isLogIn;
	UserInfo user;
	
	// 필터 슬라이더바
	FilterInfo filterInfo = new FilterInfo();
	
	// center
	List<DessertInfo> desserts;			// 디저트 목록 (필터링이 적용되어 화면상에선 걸러져서 보여짐)
	
	// right
	// 장바구니 목록
	//List<DessertInfo> selectedDesserts;// 장바구니 - user 의 List 에서 얻어옴
	DessertInfo totalInfo;				 // 선택한 음식들의 총 합 계산 - 가격, 칼로리, 나트륨,.. , 총 퍼센트 총합
	
	
	// getter setter
	public UserInfo getUser() {
		return user;
	}
	
	public void setUser(UserInfo user) {
		this.user = user;
	}
	
	public void addDesserts(DessertInfo dessert) {
		desserts.add(dessert);
	}
	
	public DessertInfo getTotalInfo() {
		return totalInfo;
	}

	public void setTotalInfo(DessertInfo totalInfo) {
		this.totalInfo = totalInfo;
	}

	
	
	
	
}
