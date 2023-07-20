/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookapplication;

/**
 *
 * @author victorbarnett
 */
public class Book {
    
    private double Price;
    
    private String Name;

    public Book(double Price, String Name) {
        this.Price = Price;
        this.Name = Name;
    }
    

    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get the value of Price
     *
     * @return the value of Price
     */
    public double getPrice() {
        return Price;
    }

    /**
     * Set the value of Price
     *
     * @param Price new value of Price
     */
    public void setPrice(double Price) {
        this.Price = Price;
    }

    
}
