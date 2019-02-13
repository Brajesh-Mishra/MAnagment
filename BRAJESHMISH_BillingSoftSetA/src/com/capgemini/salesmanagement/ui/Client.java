package com.capgemini.salesmanagement.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.SalesDAO;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {

	public static void main(String[] args) {
		
	ISaleService iSaleService=new SaleService(new SalesDAO());	
	
	Scanner scanner=new Scanner(System.in);
	
	Sale sale=new Sale();
	int a=1;
	while(a==1) {
	System.out.print("Enter the product code: \t");
	int ProductCode=scanner.nextInt();
	
	if(iSaleService.validateProductCode(ProductCode))
	sale.setProdCode(ProductCode);
	else
	System.out.println("you Have Entered Wrong Product Code");	
	
	
	System.out.print("Enter the quantity: \t");
	int qty=scanner.nextInt();
	if(iSaleService.validateQuantity(qty))
	sale.setQuantity(qty);
	else
		System.out.println("You Have entered Wrong Quantity");
	
	System.out.print("Product Category \t");
	String cat =scanner.next();
	if(iSaleService.validateProductCat(cat))
	sale.setCategory(cat);
	else
		System.out.println("You have Entered Wrong category");

	
	
	System.out.print("Product Name \t");
	String name=scanner.next();
	if(iSaleService.validateproductname(name))
	{	sale.setProductName(name);
	
	}else
		System.out.println("you Have Enetered Wrong prioduct Name");
	
	

	
	System.out.print("Product Description \t");
	sale.setProductDescritpion(scanner.next());
	

	System.out.print("Product price \t");
	float price=scanner.nextFloat();
	if(iSaleService.validateProductPrice((float)price))
	sale.setProductPrice(price);
	else
		System.out.println("Enetred the wrong price");

	
	HashMap<Integer,Sale> saleObjcet=iSaleService.insertSalesdetails(sale);
	Set<Map.Entry<Integer,Sale>> setObj=saleObjcet.entrySet();
	
	for(Map.Entry<Integer,Sale> iterate:setObj)
		System.out.println(iterate.getValue());
	}		

	System.out.println();
	}
	
}

	