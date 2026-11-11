package com.itheima;

import java.util.Arrays;

public class paractice4 {
    public static void main(String[] args) {
        System.out.println("请输入一共整数：");
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int num=sc.nextInt();
        boolean []isprime=prime(num);
        for(int i=1; i<=num; i++){
            if(isprime[i]) System.out.print(i+" ");
        }
    }
    public  static boolean[] prime(int num){
        boolean []isprime=new boolean[num+1];
        Arrays.fill(isprime,true);
        isprime[0]=isprime[1]=false;
        for(int i=2; i*i<=num; i++){
            if(isprime[i]){
                for(int j=i*i; j<=num; j+=i)
                    isprime[j]=false;
            }
        }
        return isprime;
    }
}
