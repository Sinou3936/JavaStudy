package ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print(">> ");
            String str = scan.nextLine();
            if(str.equals("그만")){
                System.out.println("프로그램 종료");
                break;
            }
            StringTokenizer st = new StringTokenizer(str, " ");
            System.out.println("어절 개수: "+ st.countTokens());
        }
        scan.close();
    }
}
