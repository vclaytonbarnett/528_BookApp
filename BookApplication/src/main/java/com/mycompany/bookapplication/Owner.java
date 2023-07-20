/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookapplication;
import java.util.ArrayList;

/**
 *
 * @author victorbarnett
 */
public class Owner {
    ArrayList<Book> Books;
    ArrayList<Customer> Customers;

    public Owner() {
        this.Books = new ArrayList<>();
        this.Customers = new ArrayList<>();
    }
    
    public void addBook(Book b){
        this.Books.add(b);
    }
    
    public void deleteBook(Book b){
        this.Books.remove(b);
    }
    
    public void addCustomer(Customer c){
        this.Customers.add(c);
    }
    
    public void deleteCustomer(Customer c){
        this.Customers.remove(c);
    }
    
    
}
