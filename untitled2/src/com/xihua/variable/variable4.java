package com.xihua.variable;

import java.util.Scanner;

public class variable4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个byte");
        short b1=sc.nextShort();
        System.out.println("请输入第二个byte");
        short b2=sc.nextShort();
        System.out.println("两个·byte的byte类型的和是："+(byte)(b1+b2));
        System.out.println("两个·byte的int类型的和是："+(b1+b2));
    }
}
