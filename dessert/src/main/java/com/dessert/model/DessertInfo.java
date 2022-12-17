package com.dessert.model;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.springframework.util.ResourceUtils;

import com.dessert.constval.EnumClass.AnimalType;
import com.dessert.constval.EnumClass.DessertType;
import com.dessert.view.MainPageView;

public class DessertInfo extends DetailsInfo {
	int id;

	BufferedImage img;

	Boolean isLiked; // 좋아요
	int likedCnt; // 전체 좋아요 수 합

	AnimalType animalType; // 섭취하는 동물 종류
	DessertType dessertType;// 디저트 타입

	float weight; // 주 섭취를 하는 동물의 몸무게 (이걸로 소/중/대 구분)

	// !! 미사용 기능, 지우지는 않음 !!
	// 하루 권장량에 따른 영양분 비율
	float perCalorie; // 칼로리
	float perNatrium; // 나트륨
	float perSugar; // 당
	float perCarb; // 탄수화물
	float perProtein; // 단백질
	float perFat; // 지방

	// 동물용
	public DessertInfo(int id, BufferedImage img, Boolean isLiked, int likedCnt, AnimalType animalType,
			DessertType dessertType, float weight) {
		this.id = id;

		if (img == null) {
			// default image 가져옴
			try {
//				File file = ResourceUtils.getFile("/dessert/src/main/webapp/resources/Image/dounut.jpg");
				this.img = ImageIO.read(ResourceUtils.getFile("/dessert/src/main/webapp/resources/Image/dounut.jpg"));

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			this.img = img;
		}

		this.isLiked = isLiked;
		this.likedCnt = likedCnt;
		this.animalType = animalType;
		this.dessertType = dessertType;
		this.weight = weight;
	}

	// TODO ) 리팩토링하면서 지울 예정
	// 사람용
	/*
	 * public DessertInfo(int id, BufferedImage img, Boolean isLiked,
	 * RecommandNutritions nutritions) { super();
	 * 
	 * this.id = id;
	 * 
	 * if(img == null) { // default image 가져옴 try { // File file =
	 * ResourceUtils.getFile("/dessert/src/main/webapp/resources/Image/dounut.jpg");
	 * this.img = ImageIO.read(ResourceUtils.getFile(
	 * "/dessert/src/main/webapp/resources/Image/dounut.jpg"));
	 * 
	 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
	 * e) { e.printStackTrace(); } } else { this.img = img; }
	 * 
	 * this.isLiked = isLiked;
	 * 
	 * perCalorie = this.getCalorie() / nutritions.getCalorie() * 100; // 칼로리
	 * perNatrium = this.getNatrium() / nutritions.getNatrium() * 100; // 나트륨
	 * perSugar = this.getSugar() / nutritions.getSugar() * 100; // 당 perCarb =
	 * this.getCarb() / nutritions.getCarb() * 100; // 탄수화물 perProtein =
	 * this.getProtein() / nutritions.getProtein() * 100; // 단백질 perFat =
	 * this.getFat() / nutritions.getFat() * 100; // 지방 }
	 */

	// method
	public void plus(DessertInfo dessert) { // 다른 디저트와 덧셈 연산
		// 총 금액, 영양분 합 갱신
		this.setPrice(this.getPrice() + dessert.getPrice());
		this.setCalorie(this.getCalorie() + dessert.getCalorie());
		this.setNatrium(this.getNatrium() + dessert.getNatrium());
		this.setSugar(this.getSugar() + dessert.getSugar());
		this.setCarb(this.getCarb() + dessert.getCarb());
		this.setProtein(this.getProtein() + dessert.getProtein());
		this.setFat(this.getFat() + dessert.getFat());
		this.setTransFat(this.getTransFat() + dessert.getTransFat());

		// 총 퍼센트 갱신
		this.setPerCalorie(this.getPerCalorie() + dessert.getPerCalorie());
		this.setPerNatrium(this.getPerNatrium() + dessert.getPerNatrium());
		this.setPerSugar(this.getPerSugar() + dessert.getPerSugar());
		this.setPerCarb(this.getPerCarb() + dessert.getPerCarb());
		this.setPerProtein(this.getPerProtein() + dessert.getPerProtein());
		this.setPerFat(this.getPerFat() + dessert.getPerFat());
	}

	public void sub(DessertInfo dessert) { // 다른 디저트와 뺄셈 연산
		// 총 금액, 영양분 합 갱신
		this.setPrice(this.getPrice() - dessert.getPrice());
		this.setCalorie(this.getCalorie() - dessert.getCalorie());
		this.setNatrium(this.getNatrium() - dessert.getNatrium());
		this.setSugar(this.getSugar() - dessert.getSugar());
		this.setCarb(this.getCarb() - dessert.getCarb());
		this.setProtein(this.getProtein() - dessert.getProtein());
		this.setFat(this.getFat() - dessert.getFat());
		this.setTransFat(this.getTransFat() - dessert.getTransFat());

		// 총 퍼센트 갱신
		this.setPerCalorie(this.getPerCalorie() - dessert.getPerCalorie());
		this.setPerNatrium(this.getPerNatrium() - dessert.getPerNatrium());
		this.setPerSugar(this.getPerSugar() - dessert.getPerSugar());
		this.setPerCarb(this.getPerCarb() - dessert.getPerCarb());
		this.setPerProtein(this.getPerProtein() - dessert.getPerProtein());
		this.setPerFat(this.getPerFat() - dessert.getPerFat());
	}

	// getter / setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}

	public Boolean getIsLiked() {
		return isLiked;
	}

	public void setIsLiked(Boolean isLiked) {
		this.isLiked = isLiked;
	}

	public int getLikedCnt() {
		return likedCnt;
	}

	public void setLikedCnt(int likedCnt) {
		if(likedCnt >= 0)
			this.likedCnt = likedCnt;
		else 
			this.likedCnt = 0;
	}

	public float getPerCalorie() {
		return perCalorie;
	}

	public void setPerCalorie(float perCalorie) {
		if(perCalorie >= 0)
			this.perCalorie = perCalorie;
		else 
			this.perCalorie = 0;
	}

	public float getPerNatrium() {
		return perNatrium;
	}

	public void setPerNatrium(float perNatrium) {
		if(perNatrium >= 0)
			this.perNatrium = perNatrium;
		else 
			this.perNatrium = 0;
	}

	public float getPerSugar() {
		return perSugar;
	}

	public void setPerSugar(float perSugar) {
		if(perSugar >= 0)
			this.perSugar = perSugar;
		else 
			this.perSugar = 0;
	}

	public float getPerCarb() {
		return perCarb;
	}

	public void setPerCarb(float perCarb) {
		if(perCarb >= 0)
			this.perCarb = perCarb;
		else 
			this.perCarb = 0;
	}

	public float getPerProtein() {
		return perProtein;
	}

	public void setPerProtein(float perProtein) {
		if(perProtein >= 0)
			this.perProtein = perProtein;
		else 
			this.perProtein = 0;
	}

	public float getPerFat() {
		return perFat;
	}

	public void setPerFat(float perFat) {
		if(perFat >= 0)
			this.perFat = perFat;
		else 
			this.perFat = 0;
	}

}
