package ch02;

import java.util.Scanner;

public class ex11B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("달을 입력 하세여 (1~12)>> ");
        int n = scan.nextInt();

        switch (n){
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
                System.out.println("겨울");
                break;
                default:
                    System.out.println("날짜 입력이 잘 못 되었습니다.");
                    break;
        }
    }
}
