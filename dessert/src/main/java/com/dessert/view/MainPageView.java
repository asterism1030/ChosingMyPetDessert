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
	
	//// body
	// left
	// 로그인 / 아웃
	public boolean isLogIn;
	UserInfo user;
	
	// 필터 슬라이더바
	FilterInfo filterInfo = new FilterInfo();
	
	// center
	List<DessertInfo> desserts;	// 디저트 목록 (필터링이 적용되어 화면상에선 걸러져서 보여짐)
	
	// right
	// 장바구니 목록
	List<DessertInfo> selectedDesserts;
	DetailsInfo totalInfo;		// 선택한 음식들의 총 합 계산 - 가격, 칼로리, 나트륨 등등..
	DetailsInfo totalPerInfo;	// 하루 권장량에 따른 퍼센트 총 합
	
	// method
	public static MainPageView getInst() {
		if (inst == null) {
			inst = new MainPageView();
		}
		return inst;
	}
	
	// getter setter
	public UserInfo getUser() {
		return user;
	}
	
	public void setUser(UserInfo user) {
		this.user = user;
	}
	
	public void AddDesserts(DessertInfo dessert) {
		desserts.add(dessert);
	}
	
	public void AddSelectedDesserts(DessertInfo dessert) {
		selectedDesserts.add(dessert);
	}

	public DetailsInfo getTotalInfo() {
		return totalInfo;
	}

	public void setTotalInfo(DetailsInfo totalInfo) {
		this.totalInfo = totalInfo;
	}

	public DetailsInfo getTotalPerInfo() {
		return totalPerInfo;
	}

	public void setTotalPerInfo(DetailsInfo totalPerInfo) {
		this.totalPerInfo = totalPerInfo;
	}
	
	
	
	
}
