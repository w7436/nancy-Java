/**
 * @ClassName Blog
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/15 9:47
 * @Version 1.0
 **/
package nancy.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不一致
    private String views;
}