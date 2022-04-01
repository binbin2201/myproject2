package com.bin.webshopping;

public class Customer {
    String id;
    int money;

    public Customer(String id,int money){
        this.id=id;
        this.money=money;
    }
    public int point() {
        return (int) (money*0);
    }
    public int dmoney() {
        return (int) (money * 1);
    }
    public void print(){
        System.out.println(id+"\t"+money+"\t"+dmoney()+"("+point()+")");
    }
}
