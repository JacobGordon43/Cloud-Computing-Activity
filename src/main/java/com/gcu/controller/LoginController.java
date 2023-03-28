package com.gcu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.gcu.business.OrdersBusinessService;
import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/login")
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
    //dependency injection
    //We can use autowiring on properties, setters, and constructors
    //Using autowired on a property eliminated the need to getters and setters
    //When autowiring a property in bean, the property's class type is used
    //for searching a matching bean definition in the configuration file
    //If a bean is found, it is injected into the property.
    //In this case, autowiring to the SpringConfig getOrdersBusinessMethod
    @Autowired
    private OrdersBusinessServiceInterface service;
    @Autowired
    private SecurityBusinessService security;

	@GetMapping("/")
	public String display(Model model) {
	//Display login form view
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		logger.info("Entering login");
		return "login";
	}

    @PostMapping("/doLogin")
    public String doLogin(@Valid LoginModel loginModel, BindingResult bindResult, Model model){
        //System.out.println(String.format("Form with username of %s and password of %s", loginModel.getUsername(), loginModel.getPassword()));
        if(bindResult.hasErrors()){
            model.addAttribute("title", "login form");
            logger.info("There was an error in logging in");
            return "login";
        }

        //Make a call to the Security business Service
        security.authenticate(loginModel.getUsername(), loginModel.getPassword());

        //make a call to the orders business service
        service.test();
        //Display the Orders view
        model.addAttribute("title", "My Orders");
        model.addAttribute("orders", service.getOrders());
        logger.info(String.format("Logged in with username of %s and password of %s", loginModel.getUsername(), loginModel.getPassword()));
        return "orders";
    }
}
