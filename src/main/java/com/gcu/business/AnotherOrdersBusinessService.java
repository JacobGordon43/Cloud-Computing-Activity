package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {
    @Override
    public void test() {
        System.out.println("Hello from the AnotherOrdersBusinessService");
    }

    public List<OrderModel> getOrders(){
        List<OrderModel> orders = new ArrayList<OrderModel>();
        orders.add(new OrderModel(0L, "0000000001", 1.00f, "Product1", 1));
        orders.add(new OrderModel(1L, "0000000002", 1.00f, "Product2", 2));
        orders.add(new OrderModel(2L, "0000000003", 1.00f, "Product3", 3));
        orders.add(new OrderModel(3L, "0000000004", 1.00f, "Product4", 4));
        orders.add(new OrderModel(4L, "0000000005", 1.00f, "Product5", 5));

        return orders;
    }
    public void init() {
        System.out.println("In the OrderBusinessService.init()");        
    }

    public void destroy() {
        System.out.println("In the OrderBusinessService.destroy()");        
    }
}
