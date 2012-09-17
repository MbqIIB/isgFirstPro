package com.isg.ifrend.web.security;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class DatabaseSecurer extends JdbcDaoSupport {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private SaltSource saltSource;
	@Autowired
	@Qualifier("jdbcUserService")
	private UserDetailsService userDetailsService;
	
	
	public void secureDatabase() {
		getJdbcTemplate().query("select username, password from users", 
		new RowCallbackHandler(){
		@Override
		public void processRow(ResultSet rs) throws SQLException {
			String username = rs.getString(1);System.out.println("username --> : " + username);
			String password = rs.getString(2);System.out.println("password --> : " + password);
			UserDetails user =	userDetailsService.loadUserByUsername(username);
			Object salt = saltSource.getSalt(user);System.out.println("salt --> : " + salt);
			System.out.println("salt --> : " + saltSource.getSalt(user));
			String encodedPassword = passwordEncoder.encodePassword(password, saltSource.getSalt(user));
			getJdbcTemplate().update("update users set password = ? where username = ?",encodedPassword,username);
			System.out.println("Updating password for username: "+username+" to: "+encodedPassword);
		}
		});
}
	
	

}
