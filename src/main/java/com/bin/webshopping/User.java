package com.bin.webshopping;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        //Customer Jason = new Customer("001",500);
        //SilverCustomer Kelly = new SilverCustomer("002",1500);
        //Jason.print();
        //Kelly.print();
        List<Customer>customers = new ArrayList<>();
        customers.add(new Customer("001",500));
        customers.add(new SilverCustomer("002",1500));
        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
    }
}
