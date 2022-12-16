package com.dessert.model;

import java.util.Date;

import com.dessert.constval.EnumClass.PersonType;

public class UserInfo {
	String name;
	
	Date birth;
	float weight;
	
	String id;
	
	PersonType personType;	// 성별 나이 내부에서 계산 안하고 사용자가 택하도록 함 - 부모님 계정 같은

	public UserInfo(String name, Date birth, float weight, String id, PersonType personType) {
		super();
		
		this.name = name;
		this.birth = birth;
		this.weight = weight;
		this.id = id;
		this.personType = personType;
	}
	
	
}
