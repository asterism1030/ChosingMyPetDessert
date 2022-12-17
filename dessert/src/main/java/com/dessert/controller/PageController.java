package com.dessert.controller;

import com.dessert.model.UserInfo;

public class PageController {
	// SingleTone
	private static PageController inst = null;
	public static PageController getInst() {
		if (inst == null) {
			inst = new PageController();
		}
		return inst;
	}

	// 특정 영역 갱신
	public boolean refreshLoginRegion(UserInfo user) {
		boolean isSuccess = true;

		// TODO) left - 유저 영역 - 로그인/로그아웃 버튼 영역 을 갱신한다
		// service 호출

		return isSuccess;
	}

	public boolean refreshDessertListRegion() {
		boolean isSuccess = true;

		// TODO) center - 디저트 목록페이지 - 갱신
		// service 호출

		return isSuccess;
	}

	public boolean refreshCartRegion() {
		boolean isSuccess = true;

		// TODO) right - 장바구니 - 다시 뿌린다
		// service 호출

		return isSuccess;
	}

}
