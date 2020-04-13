package ch02;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 3개 입력하세요>> ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.print("삼각형");
        }else{
            System.out.print("삼각형 아닙니다.");
        }
    }
}
