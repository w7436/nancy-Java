/**
 * @ClassName RestfulController
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/26 16:53
 * @Version 1.0
 **/
package nancy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestfulController {

    //平时风格：http://localhost:8080/add?a=1&b=2
    //RestFul风格：http://localhost:8080/add/1/2
    @RequestMapping(name="/add/{a}/{b}",method = RequestMethod.DELETE) 
    public String test(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }

}