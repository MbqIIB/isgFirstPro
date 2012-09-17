package com.isg.ifrend.web.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class IfrendUserDetails extends User implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7325749524826261103L;
	
	private String username;

	public IfrendUserDetails(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		
			
		super(username, password, enabled, accountNonExpired, credentialsNonExpired,
				accountNonLocked, authorities);
		setUsername(username);	
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	

//	
//	@Override
//	public String getUsername() {
//		System.out.println("@ TmUserDetails ---> getUsername method called.");
//		return super.getUsername();
//	}


}
