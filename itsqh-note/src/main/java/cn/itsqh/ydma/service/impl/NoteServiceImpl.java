package cn.itsqh.ydma.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.pagehelper.PageHelper;

import cn.itsqh.ydma.dao.NoteMapper;
import cn.itsqh.ydma.entity.Note;
import cn.itsqh.ydma.entity.YdmaConstant;
import cn.itsqh.ydma.entity.YdmaResult;
import cn.itsqh.ydma.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteMapper noteDao;

	@Autowired
	private RestTemplate restemplate;
	
	@Override
	public YdmaResult insert(int userId,int videoId,String context) {
		YdmaResult result = new YdmaResult();
		Note note = new Note();
		note.setContext(context);
		note.setLikeCount(0);
		note.setPublishTime(new Date());
		note.setUserId(userId);
		note.setVideoId(videoId);
		note.setTitle("");
		int ia = noteDao.insertSelective(note);
		System.out.println(ia>0?"修改成功":"修改失败");
		if(ia > 0 ) {
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.UPDATE_NOTE_SUCCESS_MSG);
			return result;
		}
		result.setCode(YdmaConstant.ERROR1);
		result.setMsg(YdmaConstant.INSERT_ERROR1_MSG);
		return result;
	}

	@Override
	public YdmaResult selectByVideoId(int id,int page, int size) {
		YdmaResult result = new YdmaResult();
		PageHelper.startPage(page, size);
		List<Note> list = noteDao.selectByVideoId(id);
		if(list != null) {
			//		根据用户id查询昵称
			for (Note note : list) {
				int userId = note.getUserId();
				//System.out.println("userId============" + userId);
				String url = "http://localhost:7001/user/findUser?id="+userId;
				YdmaResult courseResult =restemplate.getForObject(url, YdmaResult.class);
				if(courseResult.getCode()==YdmaConstant.SUCCESS) {
					System.out.println(courseResult.getData());
					Object obj = courseResult.getData();
					note.setUsers(obj);
				}
			}
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.SELECT_SUCCESS_MSG);
			result.setData(list);
			return result;
		}
		result.setData(YdmaConstant.ERROR1);
		result.setMsg(YdmaConstant.SELECT_ERROR1_MSG);
		return result;
	}

	@Override
	public YdmaResult selectByUserIdAndVideoId(int userId,int voideId,int page, int size) {
		YdmaResult result = new YdmaResult();
		PageHelper.startPage(page, size);
		List<Note> list =  noteDao.selectByUserIdAndVideoId(userId,voideId);
		if(list != null) {
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.SELECT_SUCCESS_MSG);
			result.setData(list);
			return result;
		}
		result.setData(YdmaConstant.ERROR1);
		result.setMsg(YdmaConstant.SELECT_ERROR1_MSG);
		return result;
	}

	@Override
	public YdmaResult deleteByPrimaryKey(int id) {
		YdmaResult result = new YdmaResult();
		int ia = noteDao.deleteByPrimaryKey(id);
		if(ia > 0) {
			result.setCode(YdmaConstant.SUCCESS);
			result.setMsg(YdmaConstant.DELETE_NOTE_SUCCESS_MSG);
			return result;
		}
		result.setCode(YdmaConstant.ERROR1);
		result.setMsg(YdmaConstant.DELETE_NOTE_ERROR1_MSG);
		return result;
	}

}
