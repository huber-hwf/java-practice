package com.it.oop.test2;

public class Dog {
    private  int age;
    //setAge
    public boolean setAge(int age){
        if(age<0||age>20) return false;
        this.age=age;
        return true;
    }
    //getAge
    public int getAge(){
        return this.age;
    }
}
