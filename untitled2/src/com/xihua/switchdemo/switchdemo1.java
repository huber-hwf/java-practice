package com.xihua.switchdemo;

import java.util.Scanner;

public class switchdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个int：");
        int num = sc.nextInt();
        switch (num){
            case 1: System.out.println("星期一");
                System.out.println("星期一");
                System.out.println("星期一");
            case 2: System.out.println("星期二");
        }
    }
}
