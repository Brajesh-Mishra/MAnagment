package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {

	private int saleId;
	private int prodCode;
	private String productName;
	private String category;
	private LocalDate saledate;
	private int quantity;
	private float lineTotal;
	private String productDescritpion;
	private Double productPrice;
	
	@Override
	public String toString() {
	return "Product price(Rs):\t"+this.getProductPrice()+"\nQuantity:\t"+this.getQuantity()+"\nLine Total(Rs):"+this.getLineTotal();
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescritpion() {
		return productDescritpion;
	}
	public void setProductDescritpion(String productDescritpion) {
		this.productDescritpion = productDescritpion;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getSaledate() {
		return saledate;
	}
	public void setSaledate(LocalDate saledate) {
		this.saledate = saledate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
	
	
}
