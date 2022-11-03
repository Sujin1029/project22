package com.soccer.deploy.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soccer.deploy.service.BoardService;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Locale locale, Model model) throws Exception {
		  List list = service.list();
		  model.addAttribute("list", list);
	}
}
