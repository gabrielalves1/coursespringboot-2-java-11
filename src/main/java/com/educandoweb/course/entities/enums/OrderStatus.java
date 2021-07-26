/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educandoweb.course.entities.enums;

/**
 *
 * @author gabriel.alves
 */
public class OrderStatus {

    int PAID = 2;
    int waiting_payment = 1;
    int shipped = 3;
    int delivered = 4;
    int canceled = 5;

    public OrderStatus(){
        
    }
    public int getPAID() {
        return PAID;
    }

    public void setPAID(int PAID) {
        this.PAID = PAID;
    }

    public int getWaiting_payment() {
        return waiting_payment;
    }

    public void setWaiting_payment(int waiting_payment) {
        this.waiting_payment = waiting_payment;
    }

    public int getShipped() {
        return shipped;
    }

    public void setShipped(int shipped) {
        this.shipped = shipped;
    }

    public int getDelivered() {
        return delivered;
    }

    public void setDelivered(int delivered) {
        this.delivered = delivered;
    }

    public int getCanceled() {
        return canceled;
    }

    public void setCanceled(int canceled) {
        this.canceled = canceled;
    }



    private static Iterable<OrderStatus> values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int code;
    
    private OrderStatus(int code){
        this.code = code;
        
    }
    
    public int getCode(){
        return code;
    }
    
    public static OrderStatus valueOf(int code){
        for (OrderStatus value: OrderStatus.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus Code");
    }
}
