/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educandoweb.course.entities;

import com.educandoweb.course.entities.pk.OrderItemPK;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author gabriel.alves
 */
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    
    private static final long serialVersionUID  = 1L;
    
    @EmbeddedId
    private OrderItemPK id;
    private Integer quantity;
    private double price;
    
    
    public OrderItem(){
        
    }

    public OrderItem(Order order, Product product, Integer quantity, double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }
    
    public Order getOrder(){
        return id.getOrder();
    }
    
    public void setOrder(Order order){
        id.setOrder(order);
    }
    
    public Product getProduct(){
        return id.getProduct();
    }
    
    public void setProduct(Product product){
        id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderItem other = (OrderItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
