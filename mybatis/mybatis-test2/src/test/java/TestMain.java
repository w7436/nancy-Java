import nancy.dao.StudentMapper;
import nancy.dao.TeacherMapper;
import nancy.pojo.Student;
import nancy.pojo.Teacher;
import nancy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName TestMain
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/13 16:20
 * @Version 1.0
 **/

public class TestMain {
    @Test
    public void getStudents(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for(Student stu:students){
            System.out.println(stu);
        }
        sqlSession.close();
    }


    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}