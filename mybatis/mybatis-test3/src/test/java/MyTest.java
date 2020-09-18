import nancy.dao.TeacherMapper;
import nancy.pojo.Student;
import nancy.pojo.Teacher;
import nancy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/15 8:36
 * @Version 1.0
 **/

public class MyTest {



    @Test
    public void getTeacherByid(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
//     @Test
//    public void getTeacher() {
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        List<Teacher> teacher = mapper.getTeacher();
//        for(Teacher tea : teacher) {
//            System.out.println(tea);
//        }
//        sqlSession.close();
//    }
}