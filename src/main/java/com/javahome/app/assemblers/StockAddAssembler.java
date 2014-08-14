package com.javahome.app.assemblers;

import java.util.Calendar;

import org.springframework.stereotype.Component;

import com.javahome.dao.entity.StockAddEntity;
import com.javahome.web.vo.StockVO;


@Component
public class StockAddAssembler {

	public static StockAddEntity FromStockVo(StockVO stockvo){
		
		StockAddEntity stockaddentity = new StockAddEntity();
		if(stockvo !=null){
			stockaddentity.setPrice(stockvo.getPrice());
			stockaddentity.setQuantity(stockvo.getQuantity());
			stockaddentity.setStockId(1000);
			stockaddentity.setDate(Calendar.getInstance().getTime());
		}
		return stockaddentity;
	}
	

}
