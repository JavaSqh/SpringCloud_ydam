package cn.itsqh.ydma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.itsqh.ydma.dao.VideoMapper;
import cn.itsqh.ydma.entity.Video;
import cn.itsqh.ydma.entity.YdmaConstant;
import cn.itsqh.ydma.entity.YdmaResult;
import cn.itsqh.ydma.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoMapper videoDao;
	
	@Override
	@Cacheable(value="videolike")
	public YdmaResult selectLike(String name, int page, int size) {
		YdmaResult result = new YdmaResult();
		PageHelper.startPage(page, size);
		List<Video> list =  videoDao.selectByLike(name);
		//System.out.println("访问DB");
		if(list == null ) {
			//		集合为空
			result.setCode(YdmaConstant.ERROR1);
			result.setMsg(YdmaConstant.SELECT_ERROR1_MSG);
		}else {
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.SELECT_SUCCESS_MSG);
			result.setData(list);
		}
		//list.forEach(action->System.out.println(action.getId() +" " + action.getName()));
		return result;
	}

}
