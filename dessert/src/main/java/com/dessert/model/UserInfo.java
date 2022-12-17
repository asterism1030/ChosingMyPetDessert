package com.dessert.model;

import java.util.Date;
import java.util.List;

import com.dessert.constval.EnumClass.PersonType;

public class UserInfo {
	String name;
	
	Date birth;
	float weight;
	
	String id;
	
	PersonType personType;				// 성별 나이 내부에서 계산 안하고 사용자가 택하도록 함 - 부모님 계정 같은
	
	List<DessertInfo> selectedDesserts;	// 장바구니

	public UserInfo(String name, Date birth, float weight, String id, PersonType personType) {
		super();
		
		this.name = name;
		this.birth = birth;
		this.weight = weight;
		this.id = id;
		this.personType = personType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PersonType getPersonType() {
		return personType;
	}

	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}

	public List<DessertInfo> getSelectedDesserts() {
		return selectedDesserts;
	}

	public void setSelectedDesserts(List<DessertInfo> selectedDesserts) {
		this.selectedDesserts = selectedDesserts;
	}
	
	public void addSelectedDesserts(DessertInfo dessert) {
		this.selectedDesserts.add(dessert);
	}
	
	public void subSelectedDesserts(DessertInfo dessert) {
		this.selectedDesserts.remove(dessert);
	}
	
	
}
