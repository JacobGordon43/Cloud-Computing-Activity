package com.gcu;

import com.gcu.business.AnotherOrdersBusinessService;
import com.gcu.business.OrdersBusinessService;
import com.gcu.business.OrdersBusinessServiceInterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import groovy.lang.Singleton;
//The spring framework enables automatic dependency injection
//In other words, be declearing all the bean dependencies
//in a spring configuration file, Spring container can autowire 
//relationships between collaborating beans
@Configuration
public class SpringConfig {
    //Bean annotation is applied at the method level
    @Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
    // @Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
    //RequestScope - All instances are handled independently and have no effect
    //on eachother. Request scope can be especially useful for components
    //whose properties are set by a form
    @RequestScope
    //Scoping the bean to a session is a handy way to store state relevant to a
    //specific user session. You end up with one instance per session
    // @SessionScope
    public OrdersBusinessServiceInterface getOrdersBusiness(){
        //Return defines which java class is invoked
        return new OrdersBusinessService();
    }
}
