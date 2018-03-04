package com.song.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.song.service.WebSocket;

/** 
* @author 作者 E-mail: Sugare
* @version 创建时间：2018年3月4日 下午12:52:04 
* @description 说明：WebSocketController.java
*/

@RestController
public class WebSocketController {

	@Autowired
	private WebSocket websocket;
	
	// 监听接收 ws
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		
		// 用来测试下 freemarker
		// mav.addObject("a", 123);
		
		return mav;
	}
	
	// 触发 ws
	@GetMapping("/ws")
	public void ws() {
		websocket.sendMessage("hello");
	}
}
