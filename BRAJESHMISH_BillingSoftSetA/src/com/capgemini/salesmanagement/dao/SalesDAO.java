package com.capgemini.salesmanagement.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagment.util.CollectionUtil;

public class SalesDAO implements ISaleDAO {
	/* (non-Javadoc)
	 * @see com.capgemini.salesmanagement.dao.ISaleDAO#insertSalesdetails(com.capgemini.salesmanagement.bean.Sale)
	 */
	@Override
	public HashMap<Integer,Sale> insertSalesdetails(Sale sale){
		sale.setSaleId((int)Math.random());
		sale.setLineTotal((float)(sale.getQuantity()*sale.getProductPrice()));
		CollectionUtil.setCollection(sale);
		
		
		
		return CollectionUtil.getCollection();
		
	}

}
