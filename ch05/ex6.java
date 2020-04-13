package ch05;

public class ex6 {
    public static void main(String[] args) {
        ColorPoint zeropoint = new ColorPoint();
        System.out.println(zeropoint.toString()+ " 입니다.");

        ColorPoint cp = new ColorPoint(10,10);
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+" 입니다.");
    }
}
