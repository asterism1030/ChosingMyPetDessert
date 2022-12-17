package com.dessert.service;

import com.dessert.model.DessertInfo;
import com.dessert.model.UserInfo;

public class UserInfoService {
	// SingleTone
	private static UserInfoService inst = null;
	public static UserInfoService getInst() {
		if (inst == null) {
			inst = new UserInfoService();
		}
		return inst;
	}

	// 로그인 시도 및 서버로부터 유저정보 받아서 리턴
	public UserInfo loginUser(String id, String pwd) {
		UserInfo user = null;

		// TODO) 서버로부터 유저 정보를 받아온다

		return user;
	}

	// 유저의 장바구니에 선택한 디저트 추가
	public boolean addDessertToCart(String id, DessertInfo dessert) {
		boolean isSuccess = true;

		// TODO ) 서버로 전송

		return isSuccess;
	}

	// 유저의 장바구니에 선택한 디저트 삭제
	public boolean subDessertToCart(String id, DessertInfo dessert) {
		boolean isSuccess = true;

		// TODO ) 서버로 전송

		return isSuccess;
	}

}
