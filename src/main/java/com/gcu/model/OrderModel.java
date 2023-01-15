package com.gcu.model;

public class OrderModel {
    private Long id;
    private String orderNo;
    private float price;
    private String productName;
    private int quantity;

    public OrderModel(Long id, String orderNo, float price, String productName, int quantity) {
		this.id = id;
		this.orderNo = orderNo;
		this.price = price;
        this.productName = productName;
		this.quantity = quantity;
	}
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuanity(int quanity) {
		this.quantity = quanity;
	}

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
}
