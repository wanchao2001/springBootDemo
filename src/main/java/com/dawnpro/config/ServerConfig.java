/**
 * 
 */
package com.dawnpro.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * @ServerConfig.java   		@d2016年11月4日
 * All rights reserved.
 * <p>Title: @springBootDemo</p>
 * @author wanchao
 *
 */
@Component
@ConfigurationProperties(prefix = "server")
public class ServerConfig {

	private String port;

	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}
	
	
}
