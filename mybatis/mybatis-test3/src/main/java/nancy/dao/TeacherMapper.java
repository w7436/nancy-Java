/**
 * @ClassName TeacherMapper
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/13 16:18
 * @Version 1.0
 **/
package nancy.dao;

import nancy.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

//
//   List<Teacher> getTeacher();

   Teacher getTeacher2(@Param("tid") int id);

}