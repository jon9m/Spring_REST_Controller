package com.mmk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mmk.config.interceptors.AdminInterceptor;
import com.mmk.config.interceptors.LogInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan("com.mmk")
public class DemoAppConfig implements WebMvcConfigurer {
	public void addInterceptors(InterceptorRegistry registry) {
		// LogInterceptor apply to all URLs.
		registry.addInterceptor(new LogInterceptor());

		// /api/
		registry.addInterceptor(new AdminInterceptor())//
				.addPathPatterns("/api/*/")//
				.excludePathPatterns("/admin/oldLogin");
	}
}
