package ch04;

import java.util.Scanner;

public class ex5 {
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
        for(int i=0; i<c.length; i++){
            c[i].show();
        }
        scan.close();
    }
}
class Circle {
    private double x,y;
    private int radius;

    public Circle(double x, double y, int radius){
        this.x =x;
        this.y = y;
        this.radius =radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    public void show2(){
        System.out.println("가장 면적이 큰 원은 ("+x+","+y+")"+radius);
    }

    public double area(){
        return radius*radius*3.14;
    }
}