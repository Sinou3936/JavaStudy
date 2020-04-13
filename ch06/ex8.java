package ch06;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 가능");
        String str = scan.nextLine();

        for(int i=1; i<=str.length(); i++){
            System.out.print(str.substring(i));
            System.out.println(str.substring(0,i));
        }
        scan.close();
    }
}
