package ch02;

import java.util.Scanner;

public class ex8 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2 ){
        if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
            return  true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println(inRect(x,y,100,100,200,200));

    }
}
