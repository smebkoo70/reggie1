package com.example.reggie.filter;
import lombok.extern.slf4j.Slf4j;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @author LJM
 * @create 2022/4/15
 * 检查用户是否已经完成登陆
 * filterName过滤器名字
 * urlPatterns拦截的请求，这里是拦截所有的请求
 *
 */
@WebFilter(filterName = "LongCheckFilter",urlPatterns = "/*")
@Slf4j
public class LongCheckFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        log.info("拦截到的请求:{}",request.getRequestURL());
        //对请求进行放行
        filterChain.doFilter(request,response);
    }
}