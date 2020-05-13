package com.telusko.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class MetricCounter implements Filter{
	
	
   private static int hitCount; 

   public void  init(FilterConfig config) throws ServletException {
	      // Reset hit counter.
      hitCount = 0;
   }
	   
	   
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
				
		// increase counter by one
	      hitCount++;

	      // Print the counter.
	      System.out.println("Site visits count :"+ hitCount );

	      // Pass request back down the filter chain
	      arg2.doFilter(arg0,arg1);
		
	}

}
