package ch03;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("소문자 알파벳을 입력하세요>> ");

        String s = scan.next();
        char c = s.charAt(0);

        for(int i=c-'a'; i>=0; i--){
            for(int j=0; j<=i; j++)
                System.out.print((char)('a'+j));
            System.out.println();
        }
    }
}
