package com.dessert.controller;

import com.dessert.model.DessertInfo;
import com.dessert.model.DetailsInfo;
import com.dessert.view.MainPageView;

public class DessertInfoController {
	// SingleTone
	private static DessertInfoController inst = null;
	public static DessertInfoController getInst() {
		if (inst == null) {
			inst = new DessertInfoController();
		}
		return inst;
	}

	public boolean isLikedClicked(DessertInfo dessertInfo) {
		boolean isSuccess = true;

		dessertInfo.setIsLiked(true);
		dessertInfo.setLikedCnt(dessertInfo.getLikedCnt());

		// TODO ) 화면의 아이콘을 붉은 하트로 바꿈, 전체 좋아요 수 + 1로 화면 갱신

		// TODO) 서버에 데이터 전달 - DessertItemService :: updateIsLike() 호출

		return isSuccess;
	}

}
