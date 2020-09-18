/**
 * @ClassName BlogMapper
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/15 9:50
 * @Version 1.0
 **/
package nancy.dao;

import nancy.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User queryUserById (@Param("id") int id);

    void updateUser(User user);
}