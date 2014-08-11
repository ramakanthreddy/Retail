package com.javahome.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StockController {

	@RequestMapping(value="/addStock.htm",method=RequestMethod.GET)
public String addStock(Model model){
	
	return null;
}
}
