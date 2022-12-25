/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author acer swift 3
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = "root";
        String pass = "";
        String jdbcUrl = "jdbc:mysql://localhost:3308/web_customer_tracker?useSSL=false";
        String driver = "com.mysql.jdbc.Driver";
        try{
            PrintWriter out=response.getWriter();
            out.println("Connection to database "+jdbcUrl);
            Class.forName(driver);
            Connection myConnection=DriverManager.getConnection(jdbcUrl,user,pass);
            out.println("Connection Success !!");
            myConnection.close();
        }catch(Exception exc){
            exc.printStackTrace();
            throw new ServletException(exc);
        }
    }

 

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
