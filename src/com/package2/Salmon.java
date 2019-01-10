package com.package2;

import com.package1.Seafood;

/**
 * 題目編號 Java-A2
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-03-2019
 * @since 1.0
 */

// this class is implement interface Seafood
public class Salmon implements Seafood {
    protected String name;
    protected int price;

    public Salmon(){
        this.name = "鮭魚";
        this.price = 200;
    }

    //this method overloads the Salmon() method above
    public Salmon(int price){
        this.name = "鮭魚";
        this.price = price;
    }

    //this method overloads the Salmon() method above
    public Salmon(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    //    public int getPrice(){
//        return price;
//    }
//
//    public void setPrice(int price){
//        this.price = price;
//    }

    void hello(){
        System.out.println("安安我是鮭魚");
    }

    protected void taste(){
        System.out.println("吃起來像鮭魚");
    }
}
