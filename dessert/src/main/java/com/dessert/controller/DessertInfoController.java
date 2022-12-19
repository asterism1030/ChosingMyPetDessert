package com.dessert.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dessert.model.DessertInfo;

public class DessertInfoController {
	// SingleTone
	private static DessertInfoController inst = null;
	public static DessertInfoController getInst() {
		if (inst == null) {
			inst = new DessertInfoController();
		}
		return inst;
	}
	
//	(@RequestParam("id") String user_id,
//    		@RequestParam("pwd") String user_pwd) {

	@PostMapping("/addLiked")
	public boolean isLikedClicked(@RequestParam("id") String dessert_id,
			@RequestParam("likeCnt") int likeCnt) {
		boolean isSuccess = true;
		
		// TODO ) 화면의 아이콘을 붉은 하트로 바꿈, 전체 좋아요 수 + 1로 화면 갱신

		// TODO) 서버에 데이터 전달 - DessertItemService :: updateIsLike() 호출

		return isSuccess;
	}
	
	@PostMapping("/addToCart")
	public boolean addToCart(@RequestParam("info") DessertInfo dessert_info) {
		boolean isSuccess = true;
		
		// TODO ) 메인 페이지의 유저 정보를 업데이트 하고 장바구니 페이지를 갱신함

		return isSuccess;
	}
	
	@PostMapping("/subToCart")
	public boolean subToCart(@RequestParam("id") String dessert_id) {
		boolean isSuccess = true;
		
		// TODO ) 메인 페이지의 유저 정보를 업데이트 하고 장바구니 페이지를 갱신함

		return isSuccess;
	}

}
