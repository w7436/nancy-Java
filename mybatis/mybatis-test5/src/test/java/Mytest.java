import nancy.dao.UserMapper;
import nancy.pojo.User;
import nancy.utils.MybatisUtils;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @ClassName Mytest
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/15 16:20
 * @Version 1.0
 **/

public class Mytest {

    @Test
    public void queryUserById(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        SqlSession sqlSession1 = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        System.out.println("-------------------------");


//        sqlSession.clearCache();//手动清理缓存
        User user1 = mapper.queryUserById(1);
        System.out.println(user1);

        System.out.println(user == user1);
        sqlSession.close();
    }

}