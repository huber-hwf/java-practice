package com.itheima;

public class practice7 {
    public static void main(String[] args) {
        byte []arr={97, 98, 99};
        String s1=new String(arr);
        String s2="Abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
