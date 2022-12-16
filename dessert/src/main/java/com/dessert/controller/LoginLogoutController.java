package com.dessert.controller;

import java.util.Date;
import com.dessert.constval.EnumClass.PersonType;
import com.dessert.model.UserInfo;

public class LoginLogoutController {
	
	public UserInfo LoginClicked(String id, String pwd) {
		// TODO ) 서버와의 동작 처리
		
		// 로그인 성공 시
		// get val
		String name = "";
		Date birth = new Date();
		float weight = 0.0f;
		PersonType personType = PersonType.ADULTWOMAN;
		
		// set val
		UserInfo user = new UserInfo(name, birth, weight, id, personType);
		
		return user;
	}
	
	public boolean LogoutClicked(String id) {
		boolean isSuccess = true;
		
		// TODO ) 서버와의 동작 처리
		
		return isSuccess;
	}

}
