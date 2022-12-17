package com.dessert.dao;

import java.util.ArrayList;
import java.util.List;
import com.dessert.model.DessertInfo;

public class DessertInfoDao {
	// 서버로부터 모든 디저트 정보를 받아온다
	public List<DessertInfo> getAllDessertInfoFromServer() {
		List<DessertInfo> dessertInfo = new ArrayList<DessertInfo>();
		
		// TODO ) 서버로부터 받아오고 값을 셋팅
		
		
		return dessertInfo;
	}
	
	// 갱신한 디저트 정보 - 좋아요 수 를 서버에 전달한다
	public boolean setDessertInfo(int id, boolean isLiked, int likedCnt) {
		boolean isSuccess = true;
		
		// TODO ) 서버에 값 셋팅
		if(isLiked == true) {
			
		}
		else {
			
		}
		
		return isSuccess;
	}
}
