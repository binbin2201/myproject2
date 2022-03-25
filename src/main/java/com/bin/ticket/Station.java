package com.bin.ticket;

public class Station {

    public static final Station TAIPEI_CITY = new Station(100, "Taipei");
    public static final Station TAICHUNG_CITY = new Station (200,"Taichung");
    public static final Station KAOHSIUNG_CITY= new Station(300 ,"Kaohsiung");
    int price;
    Station start;
    Station destination;

    public Station(Station start, Station destination, int price){
        this.start = start;
        this.destination = destination;
        this.price = price;
    }
    int id;
    String name;
    public Station(int id ,String name){
        this.id = id;
        this.name = name;
    }
    }

