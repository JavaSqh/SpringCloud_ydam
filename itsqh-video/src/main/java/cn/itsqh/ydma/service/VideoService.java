package cn.itsqh.ydma.service;

import cn.itsqh.ydma.entity.YdmaResult;

public interface VideoService {
	
	/**
	 * 	模糊查询视频
	 * @param name	输入的关键字
	 * @return
	 */
	public YdmaResult selectLike(String name, int page, int size);
}
