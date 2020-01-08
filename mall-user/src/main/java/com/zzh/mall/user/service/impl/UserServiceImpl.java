package com.zzh.mall.user.service.impl;

import com.zzh.mall.user.mapper.UserMapper;
import com.zzh.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;



}
