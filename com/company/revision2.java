package com.company;

class Ufc{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class revision2 {
    public static void main(String[] args) {
        Ufc ufc = new Ufc();
        ufc.setId(28);
        ufc.setName("Alex Pereira");
        System.out.println(ufc.getName());


    }
}
