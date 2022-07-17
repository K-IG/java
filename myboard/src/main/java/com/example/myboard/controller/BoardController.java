package com.example.myboard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.myboard.service.UserService;
@Controller
public class BoardController {

		private UserService userService;
		
		public BoardController(UserService userService) {
			super();
			this.userService = userService;
		}
	
		@GetMapping("/")
		public String boardPage(Model model) {
			model.addAllAttributes(userService.getAllUser());
			return "index";
		}

}
