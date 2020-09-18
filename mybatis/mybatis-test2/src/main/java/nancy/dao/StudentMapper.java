/**
 * @ClassName StudentMapper
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/13 16:18
 * @Version 1.0
 **/
package nancy.dao;

import nancy.pojo.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> getStudents();
}