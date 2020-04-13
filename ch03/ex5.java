package ch03;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("양의 정수 10개를 입력하세여>> ");

        int n[] = new int[10];

        for(int i=0; i<n.length; i++){
            n[i] = scan.nextInt();
        }
        System.out.print("3의 배수: ");
        for(int i=0; i<n.length; i++){
            if(n[i]%3 == 0){
               System.out.print(n[i]+" ");
            }
        }
    }
}
