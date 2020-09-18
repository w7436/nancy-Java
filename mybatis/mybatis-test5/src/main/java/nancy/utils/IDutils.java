/**
 * @ClassName IDutils
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/15 9:55
 * @Version 1.0
 **/
package nancy.utils;

import org.junit.Test;

import java.util.UUID;

public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test() {
        System.out.println(IDutils.getId());
    }

}