/**
 * 
 */
package com.dawnpro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @Application.java   		@d2016年11月1日
 * All rights reserved.
 * <p>Title: @springBootDemo</p>
 * @author wanchao
 *
 */
@RestController
@SpringBootApplication
@EnableTransactionManagement
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	
	
	@RequestMapping(value="/")
	@ResponseBody
	public String exceute(){
		log.info("Application exceute:" + System.currentTimeMillis());
		return "hello Application";
	}
	
	
	public static void main(String [] args){
		SpringApplication.run(Application.class, args);
	}
}
