package com.itheima;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        practice2 p=new practice2();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        System.out.println(p.sqrt(sc.nextInt()));
    }
    public int sqrt(int num){
        if(num<2) return -1;
        int left=0, right=num;
        while(right-left>1){
            int mid=left+(right-left)/2;
            if(mid<=num/mid) left=mid;
            else right=mid;
        }
        return left;
    }
}
