package com.cs.kiddo.dao;


import com.cs.kiddo.entity.User;

public interface UserDao extends BaseDao<User> {
    User getUser(String account);

    String getMaxId(); //��ȡ��ǰ�û������ID ����id
}
