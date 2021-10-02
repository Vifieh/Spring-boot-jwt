package com.example.springbootjwt.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("javainuse".equals(username)) {
			return new User("javainuse", "$2a$12$lRn09TEMV3BGzHTcIG3DQObbSt6SiTLiqC9CiTGe1MypmcgUjevwi",
					        new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User Not Found");
		}
	} 

}
