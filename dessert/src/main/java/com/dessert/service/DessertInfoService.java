package com.dessert.service;

import java.util.ArrayList;
import java.util.List;

import com.dessert.controller.UserInfoController;
import com.dessert.model.DessertInfo;

public class DessertInfoService {
	// SingleTone
	private static DessertInfoService inst = null;
	public static DessertInfoService getInst() {
		if (inst == null) {
			inst = new DessertInfoService();
		}
		return inst;
	}

	public List<DessertInfo> getDessertInfoList() {
		List<DessertInfo> desserts = new ArrayList<DessertInfo>();

		// TODO) 서버로부터 모든 디저트 정보 받아서 리스트에 저장하고 반환

		return desserts;
	}

	public boolean updateIsLike(DessertInfo dessertInfo) {
		boolean isSuccess = true;

		// TODO ) 서버에 데이터 전달, 좋아요와 전체 좋아요 갱신

		return isSuccess;
	}
}
