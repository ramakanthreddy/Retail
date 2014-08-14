package com.javahome.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javahome.app.assemblers.StockAddAssembler;
import com.javahome.dao.IStockAddDao;
import com.javahome.dao.StockAddDao;
import com.javahome.dao.entity.StockAddEntity;
import com.javahome.web.vo.StockVO;

@Service
public class StockAddService implements IStockAddService {
	@Autowired
	private IStockAddDao stockadddao;
	@Override
	public boolean StockAdd(StockVO stockvo) {
		StockAddEntity stockaddentity=StockAddAssembler.FromStockVo(stockvo);
		stockadddao.StockAddToDb(stockaddentity);
      return true;
	}

	
}
