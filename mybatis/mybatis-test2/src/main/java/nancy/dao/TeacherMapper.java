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
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {


   Teacher getTeacher(int id);
//    @Select("select * from teacher where id = #{id}")
//    Teacher getTeacher(@Param("id") int id);

}