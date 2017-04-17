package next.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Date;

/**
 * Created by eklee on 2017. 4. 17..
 */
@WebFilter("/*")
public class MyServletFilter implements Filter {

    private FilterConfig _filterConfig  = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        _filterConfig = filterConfig;
    }

    public void destroy(){
        _filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //사전로직구현

        System.out.println("start >> " + new Date());

        chain.doFilter(request, response);
        System.out.println("end >> " + new Date());
    }


}
