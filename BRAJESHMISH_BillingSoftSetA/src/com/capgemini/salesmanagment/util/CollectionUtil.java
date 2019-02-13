package com.capgemini.salesmanagment.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.capgemini.salesmanagement.bean.Sale;

public class CollectionUtil {

	private static Map<Integer,Sale> sales=new HashMap<Integer,Sale>();
	
	public static HashMap<Integer,Sale> getCollection(){
		return  (HashMap<Integer,Sale>) sales;
	}

	public static void setCollection(Sale sale){
		sales.put(sale.getSaleId(),sale);
		}
	}


