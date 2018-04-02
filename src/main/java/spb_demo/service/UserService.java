package spb_demo.service;

import spb_demo.pojo.User;

import java.util.List;

/**
 * Created by Chengxs on 2018/4/2.
 */
public interface UserService {
    public List<User> findByName(String name);

    public int update(int id, String name);
}
