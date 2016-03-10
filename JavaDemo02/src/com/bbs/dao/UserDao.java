package com.bbs.dao;

import com.bbs.model.User;
import java.util.List;

/**
 * Created by Administrator on 2016/3/10.
 */
public interface UserDao {
    public List<User> getUsers();
    public User getUserById(int id);
}
