/**
 * @ClassName helloController
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/25 17:05
 * @Version 1.0
 **/
package nancy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

    //真实访问地址：项目名/hello
    // @RequestMapping("/hello")
    public String hello(Model model) {
        //向模型中添加属性msg与值，可以在jsp页面取出并渲染
        model.addAttribute("msg","------------hello,springmvc");
        return "hello";//会被视图解析器处理
    }
}