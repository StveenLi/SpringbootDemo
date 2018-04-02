package spb_demo.mapper;

import org.apache.ibatis.annotations.Select;
import base.MyMapper;
import spb_demo.pojo.User;

import java.util.List;

/**
 * Created by Chengxs on 2018/4/2.
 */
public interface UserMapper extends MyMapper<User>{

    @Select("select * from user where name like #{name}")
    public List<User> findByName(String name);
}
