package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ErshoujiaoyiDao;
import com.entity.ErshoujiaoyiEntity;
import com.service.ErshoujiaoyiService;
import com.entity.vo.ErshoujiaoyiVO;
import com.entity.view.ErshoujiaoyiView;

@Service("ershoujiaoyiService")
public class ErshoujiaoyiServiceImpl extends ServiceImpl<ErshoujiaoyiDao, ErshoujiaoyiEntity> implements ErshoujiaoyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErshoujiaoyiEntity> page = this.selectPage(
                new Query<ErshoujiaoyiEntity>(params).getPage(),
                new EntityWrapper<ErshoujiaoyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErshoujiaoyiEntity> wrapper) {
		  Page<ErshoujiaoyiView> page =new Query<ErshoujiaoyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErshoujiaoyiVO> selectListVO(Wrapper<ErshoujiaoyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErshoujiaoyiVO selectVO(Wrapper<ErshoujiaoyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErshoujiaoyiView> selectListView(Wrapper<ErshoujiaoyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErshoujiaoyiView selectView(Wrapper<ErshoujiaoyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
