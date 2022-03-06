package cn.itsqh.ydma.entity;

import java.io.Serializable;

public class YdmaConstant implements Serializable {
	public static final int SUCCESS = 0;
	public static final int ERROR1 = 1;
	public static final int ERROR2 = 2;
	public static final int ERROR3 = 3;
	public static final int ERROR4 = 4;
	public static final int ERROR5 = 5;
	
	
	
	public static final String REGIST_SUCCESS_MSG = "用户注册成功";
	public static final String REGIST_ERROR1_MSG = "用户名已存在";
	
	public static final String INSERT_SUCCESS_MSG = "添加成功";
	public static final String INSERT_ERROR1_MSG = "添加失败";
	
	public static final String LOGIN_SUCCESS_MSG = "登录成功";
	public static final String LOGIN_ERROR1_MSG = "账号或密码错误";
	
	public static final String UPDATE_PASSWORD_ERROR1_MSG = "两次密码输入不一致";
	public static final String UPDATE_PASSWORD_ERROR2_MSG = "密码不正确";
	public static final String UPDATE_PASSWORD_SUCCESS_MSG = "密码修改成功";
	public static final String UPDATE_PASSWORD_ERROR3_MSG = "密码修改失败";
	
	public static final String UPDATE_USER_SUCCESS_MSG = "用户信息更新成功";
	public static final String UPDATE_USER_ERROR1_MSG = "用户信息更新失败";
	
	public static final String UPDATE_ISSUE_ERROR1_MSG = "不允许设置";
	public static final String UPDATE_ISSUE_ERROR2_MSG = "正确答案设置失败";
	public static final String UPDATE_ISSUE_SUCCESS_MSG = "正确答案设置成功";
	
	public static final String UPDATE_NOTE_SUCCESS_MSG = "笔记添加成功";
	
	public static final String INSERT_NOTE_SUCCESS_MSG = "笔记收藏成功";
	
	public static final String DELETE_NOTE_SUCCESS_MSG = "笔记删除成功";
	public static final String DELETE_NOTE_ERROR1_MSG = "笔记删除失败";
	
	
	public static final String PARAM_ERROR5_MSG = "输入参数不合法";
	
	public static final String SELECT_SUCCESS_MSG = "查询成功";
	public static final String SELECT_ERROR1_MSG = "查询失败";
    public static final String INSERT_LOGINHISTORY_SUCCESS_MSG = "INSERT_LOGINHISTORY_SUCCESS_MSG";
	public static final String INSERT_LOGINHISTORY_ERROR_MSG = "INSERT_LOGINHISTORY_ERROR_MSG";
}
