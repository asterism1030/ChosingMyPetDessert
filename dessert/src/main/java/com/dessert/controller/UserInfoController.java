package com.dessert.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dessert.constval.EnumClass.PersonType;
import com.dessert.model.DessertInfo;
import com.dessert.model.UserInfo;

@Controller
public class UserInfoController {
	// SingleTone
	private static UserInfoController inst = null;
	public static UserInfoController getInst() {
		if (inst == null) {
			inst = new UserInfoController();
		}
		return inst;
	}

	// 장바구니에서 결제하기 버튼 클릭시
	public boolean buyDessertsFromCart(UserInfo user) {
		boolean isSuccess = true;

		// TODO ) 결제 수속 창을 띄운다

		return isSuccess;
	}

	public boolean addDessertToCart(DessertInfo dessert) {
		boolean isSuccess = true;

		//

		// TODO ) 서버로 전송 serivce 호출
//		UserInfoService :: addDessertToCart(String id, DessertInfo dessert)

		return isSuccess;
	}

	public boolean subDessertToCart(DessertInfo dessert) {
		boolean isSuccess = true;

		// TODO ) 서버로 전송 serivce 호출
//		UserInfoService :: subDessertToCart(String id, DessertInfo dessert)

		return isSuccess;
	}

	@GetMapping("/login")
    public String LoginClicked(@RequestParam("id") String user_id, @RequestParam("pwd") String user_pwd) {
        System.out.println("\n\n\n\n");
        System.out.println("ParamData num = " + user_id);
        System.out.println("ParamData message = " + user_pwd);
        
        /*
        // 로그인 성공 시
     	// get val
     	String name = "";
     	Date birth = new Date();
     	float weight = 0.0f;
     	PersonType personType = PersonType.ADULTWOMAN;
     	// set val
     	UserInfo user = new UserInfo(name, birth, weight, id, personType);
     	*/
        
        return "GET 보내기 성공!";
    }
	
	public UserInfo LoginClicked_tmp(String id, String pwd) {
		// TODO ) 서버와의 동작 처리

		

		return null;
	}

	public boolean LogoutClicked(String id) {
		boolean isSuccess = true;

		// TODO ) 서버와의 동작 처리

		return isSuccess;
	}

}
