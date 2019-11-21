package com.slx.bs.filiter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.LogRecord;


@WebFilter(filterName = "webFiliter" ,urlPatterns = "/*")
public class WebFiliter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
            System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.addHeader("Access-Control-Allow-Headers"," Access-Control-Allow-Headers,userid,range,filename, filelength,Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
        filterChain.doFilter(servletRequest,response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
