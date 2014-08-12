

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javahome.app.service.IStockAddService;
import com.javahome.app.service.StockAddService;
import com.javahome.web.vo.StockVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:app-test.xml"})
public class StockAddTest {
	@Autowired
	private IStockAddService iStockAddService;
	
	@Test
	public void testAddStockSucess(){
		
	boolean result = false;
	
	StockVO stockvo = new StockVO();
	stockvo.setCategory("mobile");
	stockvo.setPrice(2000);
	stockvo.setQuantity(4);
	

	
		result = iStockAddService.StockAdd(stockvo);
	
		// TODO Auto-generated catch block
	
	Assert.assertTrue(result);
		
	}

}
