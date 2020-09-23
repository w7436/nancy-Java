import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName HelloServlet
 * @Description TODO
 * @Author nancy
 * @Date 2020/9/23 17:22
 * @Version 1.0
 **/

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、获取前端参数
        String method = req.getParameter("menthod");//获取前端参数
        if (method.equals("add")) req.getSession().setAttribute("msg","执行了add方法");
        if (method.equals("delete")) req.getSession().setAttribute("msg","执行了delete方法");

        //2、调用业务层
        //3、视图转发或者重定向
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);






    }
}