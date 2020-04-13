package ch02;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("원 중심과 반지름 입력>> ");
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        double r = scan.nextDouble();

        System.out.print("점 입력>> ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(inRect(x,y,c1,c2,r) == true){
            System.out.println("점("+(double)x+","+(double)y+") 는 원 안에 있다.");
        }else{
            System.out.println("점("+(double)x+","+(double)y+") 는 원 안에 있다.");
        }
    }
    public static boolean inRect(int x, int y, int center1, int center2, double R){

        double d = ((center1-x)*(center1-x)) +( (center2-y)*(center2-y));

        double d2 = Math.sqrt(d);

        if(d2 > R)
             return  false;
        else return  true;
    }
}
