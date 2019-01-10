package com.package2;

import com.package1.*;

/**
 * 題目編號 Java-A2：綜合練習題
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-05-2019
 * @since 1.0
 */
public class A2 {

    public static void main(String args[]){
        Salmon salmon = new Salmon(130);
        SmokedSalmonSushi sushi = new SmokedSalmonSushi(50);

        //public method can be accessed in anywhere
        String receipt1 = sushi.getReceipt();

        //protected method can be accessed by (same package/not subclass)
        salmon.taste();

        //protected method can't be accessed by (diferent package/not subclass)
        //sushi.sold(5);

        //default method can be accessed by (same package/not subclass)
        salmon.hello();

        //default method can't be accessed by (diferent package/subclass)
        //sushi.hello();

        //pivate method can only be accessed by same class
        //String receipt2 = sushi.receipt();

        //sushi inherit the method taste() in parent class Salmon
        sushi.taste();

        //class Salmon 是 interface Seafood 的實作 class
        modifySeafoodPrice(new Salmon(), 260);
    }

    /**
     * 更變 Seafood 的價格
     *
     * @param seafood class implements Seafood
     * @param price new price to change
     * @since 1.0
     */
    public static void modifySeafoodPrice(Seafood seafood, int price){
        seafood.setPrice(price);
        System.out.println("更變價格：" + seafood.getPrice());
    }
}

