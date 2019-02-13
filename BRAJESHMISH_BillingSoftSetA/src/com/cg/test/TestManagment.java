package com.cg.test;

import java.time.LocalDate;
import java.util.HashMap;

import org.junit.Test;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.SalesDAO;
import com.capgemini.salesmanagement.service.SaleService;

public class TestManagment {

	@Test
	public void test() {
		
		SaleService saleservice=new SaleService(new SalesDAO());
		Sale sale=new Sale();
		sale.setCategory("Electronics");
		sale.setLineTotal(1000);
		sale.setProdCode(1001);
		sale.setProductDescritpion("ABC");
		sale.setProductName("TV");
		sale.setProductPrice(1000);
		sale.setQuantity(1);
		sale.setSaledate(LocalDate.now());
		sale.setSaleId(1);
		
		HashMap<Integer,Sale> abc=saleservice.insertSalesdetails(sale);
				
	}

	@Test
	public void abc() {
		
		SaleService saleservice=new SaleService(new SalesDAO());
		
		saleservice.validateProductCat("Electronics");
				
	}
	@Test
	public void abcd() {
		
		SaleService saleservice=new SaleService(new SalesDAO());
		
		saleservice.validateProductCode(1001);
				
	}
	
	

}
