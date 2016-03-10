package com.bbs.test;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/3/10.
 */
public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        switch (d){
            case 0 :
                System.out.print("您好，周末");
                break;
            case (1):
                System.out.print("哎，有到工作日");
                break;
            default:
                System.out.print("输入错误");
                break;
        }
        System.out.print(d);
    }
}
