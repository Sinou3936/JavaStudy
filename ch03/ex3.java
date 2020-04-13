package ch03;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요>> ");
        int n = scan.nextInt();

        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
