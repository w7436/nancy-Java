package nancy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description TODO
 * @Author DELL
 * @Data 2020/9/10 15:34
 * @Version 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;
}
//public class User {
//    private int id;
//    private String name;
//    private String pwa;
//    public User(){
//
//    }
//
//    public User(int id, String name, String password) {
//        this.id = id;
//        this.name = name;
//        this.pwa = password;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPwa() {
//        return pwa;
//    }
//
//    public void setPwa(String pwa) {
//        this.pwa = pwa;
//    }
//
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", pwa='" + pwa + '\'' +
//                '}';
//    }
//}
