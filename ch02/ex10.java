package ch02;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);


        System.out.print("첫번째 원의 중심과 반지름 입력>> ");
        int cx1 = scan1.nextInt();
        int cy1 = scan1.nextInt();
        int r1 = scan1.nextInt();
        System.out.print("첫번째 원의 중심과 반지름 입력>> ");
        int cx2 = scan2.nextInt();
        int cy2 = scan2.nextInt();
        int r2 = scan2.nextInt();

        if(inRect(cx1,cx2,cy1,cy2,r1,r2) == true){
            System.out.println("두 원은 안 겹친다.");
        }else {
            System.out.println("두 원은 서로 겹친다.");
        }
    }
    public static boolean inRect(int x1, int y1 ,int x2, int y2, int r1, int r2){
        double d = ((x2 - x1) * (x2- x1))+ ((y2-y1)*(y2-y1));

        double d2 = Math.sqrt(d);

        if(d2>= (r1+r2)) return true;
        else return  false;
    }
}
