/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.Customer;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author acer swift 3
 */

@Repository
public class CustomerDAOImpl implements CustomerDAO{
     
    //need to inject the session factory for talking with database
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public List<Customer> getCustomers() {
        // get the current hibernate session
         Session currentSession = sessionFactory.getCurrentSession();
         // create a query
         Query<Customer> query=currentSession.createQuery("from Customer",Customer.class);//class
         
         //execute query and get result list
         
         List<Customer> customers=query.getResultList();
         
         return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {
        // get current hibernate session
         Session session=sessionFactory.getCurrentSession();
         //save the customer ... finally LOl
         session.save(customer);
    }
    
}
