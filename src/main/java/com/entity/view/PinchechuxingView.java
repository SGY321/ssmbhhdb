package com.entity.view;

import com.entity.PinchechuxingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 拼车出行
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
@TableName("pinchechuxing")
public class PinchechuxingView  extends PinchechuxingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PinchechuxingView(){
	}
 
 	public PinchechuxingView(PinchechuxingEntity pinchechuxingEntity){
 	try {
			BeanUtils.copyProperties(this, pinchechuxingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
