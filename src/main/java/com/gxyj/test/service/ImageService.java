package com.gxyj.test.service;

import com.gxyj.test.dto.ImageDTO;

/**
 * 
 * @author xuliangyong
 *
 */
public interface ImageService {
	
	/**
	 * 返回图片信息
	 * @param imageId 图片ID
	 * @return
	 */
	ImageDTO getImage(String imageId);
	 
}
