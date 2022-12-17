package com.dessert.service;

import com.dessert.model.FilterInfo;

public class FilterService {
	// SingleTone
	private static FilterService inst = null;
	public static FilterService getInst() {
		if (inst == null) {
			inst = new FilterService();
		}
		return inst;
	}

	public boolean mainPageFilterApplyBtnClicked(FilterInfo filterInfo) {
		boolean isSuccess = true;
		// TODO) 필터 값에 따라 필터링된 아이템을 띄우도록 화면 갱신

		return isSuccess;
	}
}
