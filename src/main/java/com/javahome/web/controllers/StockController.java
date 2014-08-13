package com.javahome.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javahome.app.service.IStockAddService;
import com.javahome.app.service.StockAddService;
import com.javahome.web.vo.StockVO;


@Controller
public class StockController {

	@Autowired
	private StockAddService stockAddService;
	@RequestMapping(value="/addStock",method=RequestMethod.GET)
public String addStock(Model model){
		StockVO stockvo = new StockVO();
		model.addAttribute("addstock",stockvo);
		
	
	return "addStock";
}
	@RequestMapping(value = "/addStock", method = RequestMethod.POST)
	public String addStock(@ModelAttribute("stockvo") StockVO stockvo) {
		
		
	stockAddService.StockAdd(stockvo);
		return "addStock";
	}
}