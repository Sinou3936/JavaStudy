package ch02;

import java.util.Scanner;

public class ex12B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("연산>> ");
        int a = scan.nextInt();
        String s = scan.next();
        int b = scan.nextInt();
        int sum = 0;

        switch (s){
            case "+":
                sum = a+b;
                System.out.print(a+s+b+"의 계산 결과는 "+ sum);
                break;
            case "-":
                sum = a-b;
                System.out.print(a+s+b+"의 계산 결과는 "+ sum);
                break;
            case "*":
                sum = a*b;
                System.out.print(a+s+b+"의 계산 결과는 "+ sum);
                break;
            case "/":
                if(b != 0){
                    sum = a/b;
                    System.out.print(a+s+b+"의 계산 결과는 "+ sum);
                }else if(b == 0){
                    System.out.println("0으로 나눌수 없다.");
                }
                break;
                default:
                    System.out.println("연산을 다시 입력 하세요");
                    break;
        }
    }
}
