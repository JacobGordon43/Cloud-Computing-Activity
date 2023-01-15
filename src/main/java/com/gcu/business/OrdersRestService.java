package com.gcu.business;

import java.util.List;

import com.gcu.model.OrderList;
import com.gcu.model.OrderModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController is a convenience annotation for creating Restful controllers
It adds the @Controller and @ResponseBody annotations
It converts the response to JSON or XML
 */
@RestController
//@RequestMapping is the most common and widely used annotation in Spring MVC
//It is used to map requrests into specific handler classes and/or handler methods
@RequestMapping("/service")
public class OrdersRestService {
    /*Inject this bean into the OrdersRestService bean using @Autowired on
    the field definition
    */
    @Autowired
    OrdersBusinessServiceInterface service;

    /*The @GetMapping annotation is the specialized version of the @RequestMapping
    anotation that acts as a shortcut for  @RequestMapping
    The @GetMapping method is the @Controller annotated classes, handle the HTPP GET request.
    The produces = MediaType.APPLICATION_JSON_VALUE means that yhe response that will be produced
    will be converted into JSON format
    */
    @GetMapping(path="/getjson", produces={MediaType.APPLICATION_JSON_VALUE})
    public List<OrderModel> getOrderAsJson(){
        return service.getOrders();
    }
    @GetMapping(path="/getxml", produces={MediaType.APPLICATION_XML_VALUE})
    public OrderList getOrderAsXml(){
        OrderList list = new OrderList();
        list.setOrders(service.getOrders());
        return list;
    } 
}