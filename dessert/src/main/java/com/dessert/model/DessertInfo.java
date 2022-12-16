package com.dessert.model;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.springframework.util.ResourceUtils;

public class DessertInfo extends DetailsInfo {
	int id;
	
	BufferedImage img;
	
	Boolean isLiked;	// 좋아요
	int likedCnt;	// 전체 좋아요 수 합

	// 하루 권장량에 따른 영양분 비율
	float perCalorie;	// 칼로리
	float perNatrium; 	// 나트륨
	float perSugar; 	// 당
	float perCarb; 		// 탄수화물
	float perProtein; 	// 단백질
	float perFat; 		// 지방
	
	public DessertInfo(int id, BufferedImage img, Boolean isLiked, RecommandNutritions nutritions) {
		super();
		
		this.id = id;
		
		if(img == null) {
			// default image 가져옴
			try {
//				File file = ResourceUtils.getFile("/dessert/src/main/webapp/resources/Image/dounut.jpg");
				this.img = ImageIO.read(ResourceUtils.getFile("/dessert/src/main/webapp/resources/Image/dounut.jpg"));
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			this.img = img;
		}
		
		this.isLiked = isLiked;
		
		perCalorie = this.getCalorie() / nutritions.getCalorie() * 100;	// 칼로리
		perNatrium = this.getNatrium() / nutritions.getNatrium() * 100; // 나트륨
		perSugar = this.getSugar() / nutritions.getSugar() * 100; 		// 당
		perCarb = this.getCarb() / nutritions.getCarb() * 100; 			// 탄수화물
		perProtein = this.getProtein() / nutritions.getProtein() * 100; // 단백질
		perFat = this.getFat() / nutritions.getFat() * 100; 			// 지방
	}
	
	// method

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
		this.likedCnt = likedCnt;
	}
	
	public float getPerCalorie() {
		return perCalorie;
	}

	public void setPerCalorie(float perCalorie) {
		this.perCalorie = perCalorie;
	}

	public float getPerNatrium() {
		return perNatrium;
	}

	public void setPerNatrium(float perNatrium) {
		this.perNatrium = perNatrium;
	}

	public float getPerSugar() {
		return perSugar;
	}

	public void setPerSugar(float perSugar) {
		this.perSugar = perSugar;
	}

	public float getPerCarb() {
		return perCarb;
	}

	public void setPerCarb(float perCarb) {
		this.perCarb = perCarb;
	}

	public float getPerProtein() {
		return perProtein;
	}

	public void setPerProtein(float perProtein) {
		this.perProtein = perProtein;
	}

	public float getPerFat() {
		return perFat;
	}

	public void setPerFat(float perFat) {
		this.perFat = perFat;
	}

	
	
}
