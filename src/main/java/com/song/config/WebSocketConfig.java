package com.song.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/** 
* @author 作者 E-mail: Sugare
* @version 创建时间：2018年3月4日 下午1:24:14 
* @description 说明：WebSocketConfig.java
*/

@Configuration
public class WebSocketConfig {

	@Bean
	public ServerEndpointExporter serverEndpointExporter() {
		return new ServerEndpointExporter();
	}
}
