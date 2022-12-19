package com.dessert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@PostMapping("/login")
    public String LoginClicked(@RequestParam("id") String user_id,
    		@RequestParam("pwd") String user_pwd) {
        System.out.println("\n\n\n");
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
        
        return "index";
    }
	
	@GetMapping("/logout")
	public boolean LogoutClicked() {
		boolean isSuccess = true;

		// TODO ) 로그아웃 시킴

		return isSuccess;
	}
	
	@GetMapping("/buyFromCart")
	public boolean BuyBtnClicked() {
		boolean isSuccess = true;

		// TODO ) 장바구니에 있는 아이템들 구매 - 구매창을 띄운다

		return isSuccess;
	}

}
