package ch02;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("달을 입력 하세여 (1~12)>> ");
        int n = scan.nextInt();

        if(n==12 || n==1 || n==2){
            System.out.println("겨울");
        }else if(n ==3 || n==4 || n==5){
            System.out.println("봄");
        }else  if(n==6|| n==7 || n == 8) {
            System.out.println("여름");
        }else if(n==9 || n==10 || n==11){
            System.out.println("가을");
        }
    }
}
