package com.dessert.controller;

import com.dessert.model.DessertInfo;
import com.dessert.model.DetailsInfo;
import com.dessert.view.MainPageView;

public class DessertInfoController {
	
	public boolean isLikedClicked(DessertInfo dessertInfo) {
		boolean isSuccess = true;
		
		dessertInfo.setIsLiked(true);
		dessertInfo.setLikedCnt(dessertInfo.getLikedCnt());
		
		// TODO ) 화면의 아이콘을 붉은 하트로 바꿈, 전체 좋아요 수 + 1로 화면 갱신
		
		// TODO) 서버에 데이터 전달 - DessertItemService :: updateIsLike() 호출
		
		return isSuccess;
	}
	
	public void getToCartSelectedList(DessertInfo dessert) {
		// 장바구니에 추가
		MainPageView.getInst().AddSelectedDesserts(dessert);
		// 총 금액, 영양분 합 갱신
		DetailsInfo totalInfo = MainPageView.getInst().getTotalInfo();
		
		totalInfo.setPrice(totalInfo.getPrice() + dessert.getPrice());
		totalInfo.setCalorie(totalInfo.getCalorie() + dessert.getCalorie());
		totalInfo.setNatrium(totalInfo.getNatrium() + dessert.getNatrium());
		totalInfo.setSugar(totalInfo.getSugar() + dessert.getSugar());
		totalInfo.setCarb(totalInfo.getCarb() + dessert.getCarb());
		totalInfo.setProtein(totalInfo.getProtein() + dessert.getProtein());
		totalInfo.setFat(totalInfo.getFat() + dessert.getFat());
		totalInfo.setTransFat(totalInfo.getTransFat() + dessert.getTransFat());
		
		MainPageView.getInst().setTotalInfo(totalInfo);
		
		// 총 퍼센트 갱신
		DetailsInfo totalPer = MainPageView.getInst().getTotalPerInfo();
		
		totalPer.setCalorie(totalPer.getCalorie() + dessert.getPerCalorie());
		totalPer.setNatrium(totalPer.getNatrium() + dessert.getPerNatrium());
		totalPer.setSugar(totalPer.getSugar() + dessert.getPerSugar());
		totalPer.setCarb(totalPer.getCarb() + dessert.getPerCarb());
		totalPer.setProtein(totalPer.getProtein() + dessert.getPerProtein());
		totalPer.setFat(totalPer.getFat() + dessert.getPerFat());
		
		MainPageView.getInst().setTotalPerInfo(totalPer);
		
	}
}
