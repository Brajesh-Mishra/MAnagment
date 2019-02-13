package com.capgemini.salesmanagement.service;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SalesDAO;


public class SaleService implements ISaleService  {

	ISaleDAO iSaleDao;
	public SaleService(SalesDAO salesDao) {
		iSaleDao=salesDao;
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.capgemini.salesmanagement.service.ISaleService#insertSalesdetails(com.capgemini.salesmanagement.bean.Sale)
	 */
	@Override
	public HashMap<Integer,Sale> insertSalesdetails(Sale product){
		
		
		
		return iSaleDao.insertSalesdetails(product);
	}
	
	/* (non-Javadoc)
	 * @see com.capgemini.salesmanagement.service.ISaleService#validateProductCode(int)
	 */
	@Override
	public boolean validateProductCode(int productId){
		if(productId==1001 || productId==1002 || productId==1003 || productId==1004 )
			return true;
		else
			return false;

	}
	
	public boolean validateQuantity(int qty){
		if(qty>0 && qty<5 )
			return true;
		else
			return false;
	}
	/* (non-Javadoc)
	 * @see com.capgemini.salesmanagement.service.ISaleService#validateProductCat(java.lang.String)
	 */
	@Override
	public boolean validateProductCat(String prodcat)
	{
		if(prodcat.equals("Electronics")|| prodcat.equals("Toys") )
			return true;
		else
			return false;
		
	}
	/* (non-Javadoc)
	 * @see com.capgemini.salesmanagement.service.ISaleService#validateproductname(java.lang.String)
	 */
	@Override
	public boolean validateproductname(String prodName) {

		{	if(prodName.equals("TV") || prodName.equals("Smartphone") || prodName.equals("VideoGame"))
			return true;
		}
		{	if(prodName.equals("SoftToys") || prodName.equals("telescope") || prodName.equals("barbee Doll"))
				return true;
		}
		
		return false;
	}
	/* (non-Javadoc)
	 * @see com.capgemini.salesmanagement.service.ISaleService#validateProductPrice(float)
	 */
	@Override
	public boolean validateProductPrice(float price) {
		
		if(price>200)
			return true;
		else
			return false;
}
	
}

