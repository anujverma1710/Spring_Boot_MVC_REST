package com.telusko.web;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestProcessingInterceptor extends HandlerInterceptorAdapter {
	
	private final static AtomicInteger count = new AtomicInteger(0);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        count.incrementAndGet();

        System.out.println("[---count---]" + count);
        response.getWriter().write("No. of visits of the website are" + count);

        return true;
    }
    
    
    @Override
    public void postHandle(HttpServletRequest request, 
            HttpServletResponse response, 
            Object handler, 
            ModelAndView model) throws Exception {

    	model.addObject("counter", count);
    	model.setViewName("result.jsp");
    }

}
