package nancy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MybatisUtils
 * @Description TODO
 * @Author DELL
 * @Data 2020/9/10 15:35
 * @Version 1.0
 **/
public class MybatisUtils {

    private volatile static SqlSessionFactory sqlSessionFactory;

    //第一步，SqlSessionFactory对象
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取SqlSession实例，完全包含了执行sql语句的的方法
    public static SqlSession getsqlSession(){
//        return sqlSessionFactory.openSession();//默认提交为false
        return sqlSessionFactory.openSession(true);//开启提交
    }

}
