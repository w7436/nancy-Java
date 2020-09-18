package nancy.dao;

import nancy.pojo.User;
import nancy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserDaoTest
 * @Description TODO
 * @Author DELL
 * @Data 2020/9/10 19:38
 * @Version 1.0
 **/
public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserByID(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByID(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUsers(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getUsers();
        for(User user : list){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserLimit(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("startindex",0);
        map.put("pageSize",2);
        List<User> list = mapper.getUserLimit(map);
        for(User user : list){
            System.out.println(user);
        }
        sqlSession.close();

    }
    @Test
    public void testlog4j(){
        logger.info("info:进入了testlog4j");
        logger.debug("debug:进入了log4j");
        logger.error("errot:进入了testlog4j");
    }
    @Test
    public void test() {
        //获取Sqlsession对象
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        //第一种方法：getMapper
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> list = userDao.getUserList();
        for (User u : list) {
            System.out.println(u);
        }

//        //方式二：
//        List<User> objects = sqlSession.selectList("nancy.dao.UserMapper.getUserList");
//

//        for (User u : objects) {
//            System.out.println(u);
//        }
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    //增删改需要提交业务
    public void insertUser() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.insertUser(new User(4, "小兰", "444"));
        sqlSession.commit();
        if (res > 0) System.out.println("输入成功");

        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(1, "呵呵", "111"));
        sqlSession.commit();
        if (res > 0) {
            System.out.println("更新成功");
        }

    }

    @Test
    public void insertUser2() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 6);
        map.put("name", "小花");
        map.put("pwa", "123");
        mapper.addUser1(map);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getUserLike("%小%");
        for (User us : list) {
            System.out.println(us);
        }
        sqlSession.close();
    }

}
