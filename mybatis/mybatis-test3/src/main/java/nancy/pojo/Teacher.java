/**
 * @ClassName Teacher
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/13 16:16
 * @Version 1.0
 **/
package nancy.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
    List<Student> students;
}