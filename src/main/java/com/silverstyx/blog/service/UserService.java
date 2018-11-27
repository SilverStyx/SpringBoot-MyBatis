package com.silverstyx.blog.service;

import com.github.pagehelper.PageInfo;
import com.silverstyx.blog.model.User;

public interface UserService {
    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}
