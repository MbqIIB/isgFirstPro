package com.isg.ifrend.web.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class IfrendAccessDeniedHandler implements AccessDeniedHandler {
	
	private String accessDeniedURL;
	

	public IfrendAccessDeniedHandler() {
	}
	
	public IfrendAccessDeniedHandler(String accessDeniedURL) {
		
		this.accessDeniedURL = accessDeniedURL;
	}


	public String getAccessDeniedURL() {
		return accessDeniedURL;
	}


	public void setAccessDeniedURL(String accessDeniedURL) {
		this.accessDeniedURL = accessDeniedURL;
	}


	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException ade) throws IOException, ServletException {
	
		System.out.println("executing handle() method @ " + this.getClass().getName());
		
		response.sendRedirect(accessDeniedURL);
		request.getSession().setAttribute("message", "You are not authorized to access the resource");
		

	}

}
