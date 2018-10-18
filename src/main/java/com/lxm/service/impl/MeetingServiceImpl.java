package com.lxm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxm.bean.Users;
import com.lxm.service.MeetingService;
import com.lxm.service.UsersService;

@Service
public class MeetingServiceImpl implements MeetingService{

	@Autowired
	UsersService usersUservice;
	
	@Override
	public int meetingInIt(String usersid) {
		System.out.println("--- 在后台查询会议相关信息  ---");
		// 根据用户id 查询 用户信息
		System.out.println("--- 在用户id相关信息  ---");
		Users users= usersUservice.selectById(usersid);
		System.out.println(users);
		return 0;
	}

}
