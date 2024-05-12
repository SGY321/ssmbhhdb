package com.entity.view;

import com.entity.DiscusstucaodahuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 吐槽大会评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
@TableName("discusstucaodahui")
public class DiscusstucaodahuiView  extends DiscusstucaodahuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstucaodahuiView(){
	}
 
 	public DiscusstucaodahuiView(DiscusstucaodahuiEntity discusstucaodahuiEntity){
 	try {
			BeanUtils.copyProperties(this, discusstucaodahuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
