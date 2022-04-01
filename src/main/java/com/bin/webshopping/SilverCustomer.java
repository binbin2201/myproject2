package com.bin.webshopping;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id, int money) {
        super(id, money);

    }
    @Override
    public int point() {
        return (int) (money*0.1f);
    }

    @Override
    public int dmoney() {
            return (int) (money * 0.9f);
        }

}
