package com.itheima.practice5;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个角色的属性(名字,血量,攻击力)");
        String name1=sc.next();
        int hp1=sc.nextInt();
        int attack1=sc.nextInt();
        character c1=new character(name1, hp1, attack1);
        System.out.println("请输入第二个角色的属性(名字,血量,攻击力)");
        String name2=sc.next();
        int hp2=sc.nextInt();
        int attack2=sc.nextInt();
        character c2=new character(name2, hp2, attack2);
    }
}
