package nancy.dao;

import jdk.nashorn.internal.objects.annotations.Setter;
import nancy.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author DELL
 * @Data 2020/9/10 15:34
 * @Version 1.0
 **/
public interface UserMapper {
     //获取全部用户
     List<User> getUserList();
     //根据id查询用户
     User getUserById(int id);
     //添加用户
     int insertUser(User user);
     //修改用户
     int updateUser(User user);
     //利用map进行添加用户
    int addUser1(Map<String,Object> map);

    //模糊查询
     List<User> getUserLike(String name);

     //分页实现
    List<User> getUserLimit(Map<String,Integer> map);

    //获取全部的用户
    @Select("select * from user")
    List<User> getUsers();

    //方法存在多个参数的时候，所有的参数前面必须要加上param注解
    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id")int id);
}

