package com.klu.security.config;

import java.io.IOException;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//show custom error to end users

//make available globally
@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		//set ForBidden Response
		response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		//res ---> json
		response.setContentType("application/json");
		response.getWriter().write("{\"error\":\"access denied\"}");
	}

}
