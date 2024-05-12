package com.entity.view;

import com.entity.DiscusspinchechuxingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 拼车出行评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
@TableName("discusspinchechuxing")
public class DiscusspinchechuxingView  extends DiscusspinchechuxingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusspinchechuxingView(){
	}
 
 	public DiscusspinchechuxingView(DiscusspinchechuxingEntity discusspinchechuxingEntity){
 	try {
			BeanUtils.copyProperties(this, discusspinchechuxingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
