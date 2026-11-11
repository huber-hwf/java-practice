package com.xihua.whileloop;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do num++; while (num < 100);
        System.out.println(num);
    }
}
