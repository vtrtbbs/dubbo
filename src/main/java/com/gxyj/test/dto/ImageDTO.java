package com.gxyj.test.dto;

import java.io.Serializable;

public class ImageDTO implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -3282740090767410691L;
	
	private String prodId;

	private String imgName;

    private String imgUrl;

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}    

}
