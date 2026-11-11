package com.itheima;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        System.out.println(isprime(sc.nextInt())?"是质数":"不是质数");
    }
    public static boolean isprime(int num){
        if(num<2) return false;
        for(int i=2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
