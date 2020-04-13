package ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("곱하고자 하는 두수 입력>>");
        do {
            try {
                int n = scan.nextInt();
                int m = scan.nextInt();

                System.out.print(n + " * " + m + " = " + (n * m));
                break;
            }catch (InputMismatchException e){
                System.out.println("실수를 입력하면 안됩니다.");
                System.out.print("곱하고자 하는 두 수 입력>>");
                scan.nextLine();
                continue;
            }
        }while (true);
        scan.close();
    }
}
