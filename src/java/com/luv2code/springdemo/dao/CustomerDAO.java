package com.luv2code.springdemo.dao;


import com.luv2code.springdemo.entity.Customer;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author acer swift 3
 */
public interface CustomerDAO {
    public List<Customer> getCustomers();
    

    public void saveCustomer(Customer customer);
}
