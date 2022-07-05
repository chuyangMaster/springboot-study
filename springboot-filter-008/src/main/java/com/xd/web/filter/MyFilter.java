package com.xd.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器方法执行了");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
