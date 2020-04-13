package ch02;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("원화를 입력하세여(단위 원)>> ");
        int n = scan.nextInt();

        double dollar = n/1100;
        System.out.println(n +"원은 $"+dollar + "입니다.");
    }
}
