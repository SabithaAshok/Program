package com.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("sabi").password("babu").roles("USER");
		auth.inMemoryAuthentication().withUser("antony").password("baba").roles("ADMIN");
		
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/Success").hasRole("USER").and().formLogin().loginPage("/loginPage").defaultSuccessUrl("/success").failureUrl("/loginPage?error").and().logout().logoutSuccessUrl("/loginPage?logout");
		http.authorizeRequests().antMatchers("/Success").hasRole("ADMIN").and().formLogin().loginPage("/loginPage").defaultSuccessUrl("/success").failureUrl("/loginPage?error").and().logout().logoutSuccessUrl("/loginPage?logout");
	}
	}
	
	
	


