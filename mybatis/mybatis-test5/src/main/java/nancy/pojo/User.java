/**
 * @ClassName User
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/15 16:14
 * @Version 1.0
 **/
package nancy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User  implements Serializable {
    private int id;
    private String name;
    private String pwa;
}