package base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Chengxs on 2018/4/2.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>{

}
