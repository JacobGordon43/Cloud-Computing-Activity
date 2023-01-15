package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.data.OrderDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

import org.springframework.beans.factory.annotation.Autowired;

//To access the interface module, the interface must be "implemented"
//by another class with the implements keyword
//The body of the interface method is provided by the "implement" class:
//The implement keyword is used by a class so that it can follow or adhere
//to the contract provided by the interface
public class OrdersBusinessService implements OrdersBusinessServiceInterface{
    @Autowired
    OrderDataService service;
    public void test() {
        System.out.println("Hello from the OrdersBusinessService");        
    }
    
    public List<OrderModel> getOrders(){
        List<OrderEntity> ordersEntity = service.findAll();

        List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
        for (OrderEntity entity : ordersEntity) {
            ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getPrice(), entity.getProductName(), entity.getQuantity()));
        }
        return ordersDomain;
    }

    public void init() {
        System.out.println("In the OrderBusinessService.init()");        
    }

    
    public void destroy() {
        System.out.println("In the OrderBusinessService.destroy()");        
    }
}
