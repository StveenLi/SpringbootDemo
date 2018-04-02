package spb_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spb_demo.mapper.UserMapper;
import spb_demo.pojo.User;
import spb_demo.service.UserService;

import java.util.List;

/**
 * Created by Chengxs on 2018/4/2.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findByName(String name) {
        return userMapper.findByName("%"+name+"%");
    }

    @Override
    @Transactional
    public int update(int id, String name) {
        User user = userMapper.selectByPrimaryKey(id);
        user.setName(name);
        return userMapper.updateByPrimaryKey(user);
    }
}
