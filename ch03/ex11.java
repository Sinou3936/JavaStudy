package ch03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("인자가 없음");
            return;
        }
        int sum = 0;

        for(int i=0; i<args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum/args.length);
    }
}
