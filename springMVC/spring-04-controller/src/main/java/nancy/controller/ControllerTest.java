/**
 * @ClassName ControllerTest
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/26 16:18
 * @Version 1.0
 **/
package nancy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//代表这个类会被spring接管，被这个注解的类中的所有方法，如果返回值是string，并且有页面可以跳转，就会被视图解析器解析
@Controller
public class ControllerTest {

    @RequestMapping("/t1")
    public String test1(Model model) {
        model.addAttribute("msg","hello,controller");
        return "test";
    }

}