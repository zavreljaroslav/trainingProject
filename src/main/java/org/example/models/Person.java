package org.example.models;

public class Person {
    private String name;
    private byte age;
    //constructor
    public Person (byte age, String name){
        this.name = "";
        this.age = 0;
    }

    //getters

    public String getName(){
        return name;
    }

    public byte getAge(){
        return age;
    }

    //setters
    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(byte newAge){
        this.age = newAge;
    }


}

