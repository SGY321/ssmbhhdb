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


import com.dao.DiscusstucaodahuiDao;
import com.entity.DiscusstucaodahuiEntity;
import com.service.DiscusstucaodahuiService;
import com.entity.vo.DiscusstucaodahuiVO;
import com.entity.view.DiscusstucaodahuiView;

@Service("discusstucaodahuiService")
public class DiscusstucaodahuiServiceImpl extends ServiceImpl<DiscusstucaodahuiDao, DiscusstucaodahuiEntity> implements DiscusstucaodahuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstucaodahuiEntity> page = this.selectPage(
                new Query<DiscusstucaodahuiEntity>(params).getPage(),
                new EntityWrapper<DiscusstucaodahuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstucaodahuiEntity> wrapper) {
		  Page<DiscusstucaodahuiView> page =new Query<DiscusstucaodahuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstucaodahuiVO> selectListVO(Wrapper<DiscusstucaodahuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstucaodahuiVO selectVO(Wrapper<DiscusstucaodahuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstucaodahuiView> selectListView(Wrapper<DiscusstucaodahuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstucaodahuiView selectView(Wrapper<DiscusstucaodahuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
