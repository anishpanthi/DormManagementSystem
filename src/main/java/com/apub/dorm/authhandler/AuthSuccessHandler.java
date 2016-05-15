package com.apub.dorm.authhandler;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class AuthSuccessHandler implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		HttpSession session = request.getSession();

		/* Set some session variables */
		User authUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		session.setAttribute("uname", authUser.getUsername());
		session.setAttribute("authorities", authentication.getAuthorities());

		/* Set target URL to redirect */
		String targetUrl = determineTargetUrl(authentication);
		redirectStrategy.sendRedirect(request, response, targetUrl);
	}

	protected String determineTargetUrl(Authentication authentication) {
		Set<String> authorities = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
		String url = "";
		if (authorities.contains("ROLE_ADMIN")) {
			url = "/auth/admin";
		} else if (authorities.contains("ROLE_STAFF")) {
			url = "/auth/staff";
		} else if (authorities.contains("ROLE_STUDENT")) {
			url = "/auth/student";
		}
		return url;
	}	

	public RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}
}