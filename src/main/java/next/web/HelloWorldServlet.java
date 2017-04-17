package next.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by eklee on 2017. 4. 17..
 */
@WebServlet(urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    String name;

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        name = req.getParameter("name");

        resp.getWriter().println("<h1>hello world</h1><br> NAME = " +name);

    }

    @Override
    public void destroy() {
        System.out.println("destroy!!!!");
    }
}
