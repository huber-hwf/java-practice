package com.itheima;

public class practice1 {
    public static void main(String[] args) {
        practice1 p1 = new practice1();
        for (int i = 1; i <= 100; i++) {
            if(p1.isseven(i)) continue;
            System.out.println((i));
        }
    }

    public boolean isseven(int num){
        if(num%7==0) return true;
        while(num!=0){
            if(num%10==7) return true;
            num/=10;
        }
        return false;
    }
}
