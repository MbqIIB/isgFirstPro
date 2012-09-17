package com.isg.ifrend.web.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

public class IfrendSecurityDaoImpl extends JdbcDaoImpl implements IfrendSecurityChangepassword{
//
//	private final String TM_AUTHORITIES_BY_USERNAME_QUERY =" select u.username, ur.authority from tm_users u, tm_user_roles ur where u.user_id = ur.user_id and u.username =? "; 
//	
//	
//	public TmJdbcDaoImpl() {
//		super();
//		super.setAuthoritiesByUsernameQuery(TM_AUTHORITIES_BY_USERNAME_QUERY);
//	}
	@Autowired
	private SaltSource saltSource;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	@PreAuthorize("hasRole('ROLE_USER')")
	//@RolesAllowed("ROLE_USER")
	public void changepassword(String username, String password) {
		UserDetails userDetails = loadUserByUsername(username);
		String encodedPassword = passwordEncoder.encodePassword(password, saltSource.getSalt(userDetails));
		getJdbcTemplate().update("UPDATE users set password=? where username=? ", encodedPassword,username);
		//getJdbcTemplate().update("UPDATE tm_users set password=? where username=? ", password,username);
		//getJdbcTemplate().update("UPDATE users set password='" + password + "'  where username='"+ username  +"' ");
		//getJdbcTemplate().update("UPDATE users set password=(select sha1('" + password + "'))  where username='"+ username  +"' ");
		
		
	}

	@Override
	public String getUsersByUsernameQuery() {
		
		return super.getUsersByUsernameQuery();
		//return " select username,password,enabled from tm_users where username=? ";
		
		
	}

	
	
	protected UserDetails createUserDetails(String username, UserDetails userFromUserQuery, List<GrantedAuthority> combinedAuthorities)
    {
		
		System.out.println("@createUserDetails 0, username-->:"+username);
        String returnUsername = userFromUserQuery.getUsername();
        System.out.println("@createUserDetails 1, returnUsername-->:"+returnUsername);
        if(!super.isUsernameBasedPrimaryKey())
            returnUsername = username;
        System.out.println("@createUserDetails 2, returnUsername-->:"+returnUsername);
        return new IfrendUserDetails(returnUsername, userFromUserQuery.getPassword(), userFromUserQuery.isEnabled(), true, true, true, combinedAuthorities);
    }
	

}
