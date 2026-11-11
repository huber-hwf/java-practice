package com.xihua.oprator;

import java.util.Scanner;

public class operatordemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num=sc.nextInt();
        boolean result=num%3==0;
        System.out.println("这个数字是否能被三整除: "+result);
    }
}
