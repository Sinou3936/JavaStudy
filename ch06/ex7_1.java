package ch06;

import java.util.Scanner;

public class ex7_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print(">> ");
            String s = scan.nextLine();
            if(s.equals("그만")){
                System.out.println("프로그램 종료");
                break;
            }
            String str[] = s.split(" ");
            System.out.println("어절 개수: "+ str.length);
        }
    }
}
