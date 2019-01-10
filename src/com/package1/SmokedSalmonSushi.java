package com.package1;

import com.package2.Salmon;

/**
 * 題目編號 Java-A2
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-03-2019
 * @since 1.0
 */

// this class is extends class Salmon
public class SmokedSalmonSushi extends Salmon {
    private int amount;

    public SmokedSalmonSushi(){
        this.name = "燻鮭魚壽司";
        this.price = (int)(80 * 1.1);
    }

    //this method overloads the SmokedSalmonSushi() method above
    public SmokedSalmonSushi(int price){
        this.name = "燻鮭魚壽司";
        this.price = (int)(price * 1.1);
    }

    //this method overloads the SmokedSalmonSushi() method above
    public SmokedSalmonSushi(String name, int price){
        this.name = name;
        this.price = (int)(price * 1.1);
    }

    //this method overrides the getPrice() method in class Salmon
    public int getPrice(){
        return price;
    }

    //this method overrides the setPrice() method in class Salmon
    public void setPrice(int price){
        this.price = (int)(price * 1.1);
    }

    protected void sold(int amount){
        System.out.println("賣出" + amount + "個燻鮭魚壽司");
    }

    public String getReceipt(){
        //pivate method can only be accessed by same class
        return "做法：" + getReceiptDetail();
    }

    private String getReceiptDetail(){
        return "鮭魚生魚片 + 壽司米";
    }

    public void eat(){
        //protected method can be accessed by (diferent package/subclass)
        taste();
    }
}
