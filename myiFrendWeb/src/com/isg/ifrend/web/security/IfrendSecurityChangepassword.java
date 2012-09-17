package com.isg.ifrend.web.security;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IfrendSecurityChangepassword extends UserDetailsService {
	
	void changepassword(String username, String password);

}
