package ch02;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 3개 입력>> ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a<b && b<c){
            System.out.print("중간 값: "+ b);
        }else if(a>b && a<c){
            System.out.print("중간 값: "+ a);
        }
        else if(c<b && c>a){
            System.out.print("중간 값: "+c);
        }
    }
}
