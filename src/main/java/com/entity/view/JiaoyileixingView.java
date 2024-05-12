package com.entity.view;

import com.entity.JiaoyileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交易类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
@TableName("jiaoyileixing")
public class JiaoyileixingView  extends JiaoyileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoyileixingView(){
	}
 
 	public JiaoyileixingView(JiaoyileixingEntity jiaoyileixingEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoyileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
