package com.dessert.constval;

public class EnumClass {
	public static enum DessertType { BREAD, SANDWICH, CAKE, ICECREAM, PUDDING, COOKIE, SMOOTHIE, COFFEE, TEA }
	
	public static enum AnimalType { DOG, CAT, BIRD }
	
	public static enum PersonType { 
		ADULTWOMAN,
		YOUNGWOMAN,
		ADULTMAN,
		YOUNGMAN;
		
		int convertIndex(PersonType personType) {
			switch(this) {
	            case ADULTWOMAN:
	                return 0;
	            case YOUNGWOMAN:
	                return 1;
	            case ADULTMAN:
	                return 2;
	            case YOUNGMAN:
	                return 3;
	        }
			
			throw new AssertionError("Unknown PersonType: " + this);
		}
	}
	
}
