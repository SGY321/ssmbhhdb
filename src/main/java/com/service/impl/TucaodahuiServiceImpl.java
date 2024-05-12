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


import com.dao.TucaodahuiDao;
import com.entity.TucaodahuiEntity;
import com.service.TucaodahuiService;
import com.entity.vo.TucaodahuiVO;
import com.entity.view.TucaodahuiView;

@Service("tucaodahuiService")
public class TucaodahuiServiceImpl extends ServiceImpl<TucaodahuiDao, TucaodahuiEntity> implements TucaodahuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TucaodahuiEntity> page = this.selectPage(
                new Query<TucaodahuiEntity>(params).getPage(),
                new EntityWrapper<TucaodahuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TucaodahuiEntity> wrapper) {
		  Page<TucaodahuiView> page =new Query<TucaodahuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TucaodahuiVO> selectListVO(Wrapper<TucaodahuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TucaodahuiVO selectVO(Wrapper<TucaodahuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TucaodahuiView> selectListView(Wrapper<TucaodahuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TucaodahuiView selectView(Wrapper<TucaodahuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
