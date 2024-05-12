package com.entity.view;

import com.entity.TucaodahuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 吐槽大会
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
@TableName("tucaodahui")
public class TucaodahuiView  extends TucaodahuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TucaodahuiView(){
	}
 
 	public TucaodahuiView(TucaodahuiEntity tucaodahuiEntity){
 	try {
			BeanUtils.copyProperties(this, tucaodahuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
