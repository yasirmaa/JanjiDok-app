/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author Lenovo
 */
public class SoldMedicine extends Medicine{
    private String username;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;

    public SoldMedicine(String id, String namaObat, int harga, int stok, String username, 
            LocalDateTime orderDate, LocalDateTime deliveryDate) {
        super(id, namaObat, harga, stok);
        this.username = username;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    
}
