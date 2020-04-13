package ch04;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Circle c[] = new Circle[3];

        for(int i=0; i<c.length; i++){
            System.out.print("x, y, radius>>");
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            int radius = scan.nextInt();

            c[i] = new Circle(x,y,radius);
        }
        double max = c[0].area();
        int j =0;

        for(int i=1; i<c.length; i++){
            if(max <c[i].area()) {
                max = c[i].area();
                j = i;
            }
        }
        c[j].show2();
    }
}
