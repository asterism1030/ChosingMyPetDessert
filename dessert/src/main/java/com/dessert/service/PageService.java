package com.dessert.service;

import com.dessert.model.UserInfo;

public class PageService {
	// SingleTone
	private static PageService inst = null;
	public static PageService getInst() {
		if (inst == null) {
			inst = new PageService();
		}
		return inst;
	}

	// 화면 갱신
	public boolean refreshLoginRegion(UserInfo user) {
		boolean isSuccess = true;

		// TODO) left - 유저 영역 - 로그인/로그아웃 버튼 영역 을 갱신한다
		if (user == null) { // = 로그아웃

		} else { // 로그인

		}

		return isSuccess;
	}

	public boolean refreshDessertListRegion() {
		boolean isSuccess = true;

		// TODO) center - 디저트 목록페이지 - 갱신

		return isSuccess;
	}

	public boolean refreshCartRegion() {
		boolean isSuccess = true;

		// TODO) right - 장바구니 - 다시 뿌린다

		return isSuccess;
	}
}
