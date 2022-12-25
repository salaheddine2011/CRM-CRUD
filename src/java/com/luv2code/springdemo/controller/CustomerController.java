/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luv2code.springdemo.controller;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author acer swift 3
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerDAO customerDAO;// will search for an class that implements the CustomerDAO
    
    @RequestMapping("/list")
    public String listCustomers(Model theModel){
        
        //get customers from dao
        List<Customer> theCustomers=customerDAO.getCustomers();
        //add the customers to the model
        theModel.addAttribute("customers",theCustomers);
        
        return "list-customers";
    }
}
