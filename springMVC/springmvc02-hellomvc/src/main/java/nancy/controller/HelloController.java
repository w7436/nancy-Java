/**
 * @ClassName HelloController
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/24 19:25
 * @Version 1.0
 **/
package nancy.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.management.modelmbean.ModelMBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        //模型和视图
        ModelAndView mv = new ModelAndView();
        //封装对象，放在ModelAndView中
        mv.addObject("msg","helloSpringMVC");
        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("hello");
        return mv;
    }
}