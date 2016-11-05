/**
 * 
 */
package com.dawnpro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dawnpro.config.ServerConfig;

/**
 * 
 * @HelloControler.java   		@d2016年11月4日
 * All rights reserved.
 * <p>Title: @springBootDemo</p>
 * @author wanchao
 *
 */
@RestController
@EnableAutoConfiguration
public class HelloControler {
	
	@Autowired
	private ServerConfig serverConfig;
	
	
	@Value("${server.contextPath}")
	private String contextPath;
	
	@RequestMapping("port")
	public String port(){
		System.out.println("sss");
		//port = "2222";
		return contextPath + ":" + serverConfig.getPort();
	}
}
