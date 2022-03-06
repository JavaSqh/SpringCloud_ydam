package cn.itsqh.ydma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.itsqh.ydma.dao.CourseMapper;
import cn.itsqh.ydma.entity.Course;
import cn.itsqh.ydma.entity.YdmaConstant;
import cn.itsqh.ydma.entity.YdmaResult;
import cn.itsqh.ydma.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseMapper courseDao;
	
//	@Autowired
//	private RedisTemplate<Object, Object> redisTemlate;
	
	@Override
	//@Cacheable(value="course")
	public YdmaResult loadCourse(int id) {
		YdmaResult result = new YdmaResult();
		Course course  = courseDao.selectByPrimaryKey(id);
		if(course != null) {
			result.setData(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.SELECT_SUCCESS_MSG);
			result.setData(course);
		}else {
			result.setData(YdmaConstant.ERROR1);
			result.setMsg(YdmaConstant.SELECT_ERROR1_MSG);
		}
		
		return result;
	}

	@Override
	//@Cacheable(value="subjectcourse")
	public YdmaResult loadSubjectCourse(int sid, int page, int size) {
		YdmaResult result = new YdmaResult();
		PageHelper.startPage(page, size);
		List<Course> list  = courseDao.selectBySubjectId(sid);
		if(list != null ) {
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.SELECT_SUCCESS_MSG);
			result.setData(list);
		}else {
			result.setCode(YdmaConstant.ERROR1);
			result.setMsg(YdmaConstant.SELECT_ERROR1_MSG);
		}
		return result;
	}
	
	@Override
	//@Cacheable(value="course",key="#root.methodName+':'+#did+':'+#page+':'+#size")
	public YdmaResult loadDirectionCourses(int did, int page,int size) {
		YdmaResult result = new YdmaResult();
		PageHelper.startPage(page, size);
		//System.out.println(did1);
		List<Course> list = courseDao.selectByDirectionId(did);
		//System.out.println(list);
		if(!list.isEmpty()) {
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.SELECT_SUCCESS_MSG);
			result.setData(list);
			//System.out.println("123");
		}else {
			result.setCode(YdmaConstant.ERROR1);
			result.setMsg(YdmaConstant.SELECT_ERROR1_MSG);
		}
		return result;
	}

	@Override
	public YdmaResult loadPrice(int page, int size) {
		YdmaResult result = new YdmaResult();
		PageHelper.startPage(page, size);
		List<Course> list =  courseDao.selectByPrice(0);
		if(list != null ) {
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.SELECT_SUCCESS_MSG);
			result.setData(list);
		}else {
			result.setCode(YdmaConstant.ERROR1);
			result.setMsg(YdmaConstant.SELECT_ERROR1_MSG);
		}
		return result;
	}

	@Override
	public YdmaResult loadLearnCount(int page, int size) {
		YdmaResult result = new YdmaResult();
		PageHelper.startPage(page, size);
		List<Course> list = courseDao.selectByLearnCount();
		if(list != null ) {
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.SELECT_SUCCESS_MSG);
			result.setData(list);
		}else {
			result.setCode(YdmaConstant.ERROR1);
			result.setMsg(YdmaConstant.SELECT_ERROR1_MSG);
		}
		return result;
	}

	@Override
	public YdmaResult loadScore(int subjectId, int page, int size) {
		YdmaResult result = new YdmaResult();
		PageHelper.startPage(page, size);
		List<Course> list = courseDao.selectByScore(subjectId);
		if(list != null ) {
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.SELECT_SUCCESS_MSG);
			result.setData(list);
		}else {
			result.setCode(YdmaConstant.ERROR1);
			result.setMsg(YdmaConstant.SELECT_ERROR1_MSG);
		}
		return result;
	}


}
