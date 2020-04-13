package ch02;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1~99 사이의 정수 입력하세여>> ");
        int n = scan.nextInt();

        if(n/10 == 3 || n/10 == 6 || n/10 == 9){
            if(n%10 == 3 || n%10 == 6 || n%10==9){
                System.out.println("박수 짝짝");
            }else {
                System.out.println("박수 짝");
            }
        }else if(n%10 == 3 || n%10 ==  6 || n%10==9)
            System.out.println("박수 짝");
        else{
            System.out.println(n);
        }
    }
}
