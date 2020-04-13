package ch02;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("금액을 입력하세요>> ");
        int money = scan.nextInt();
        int res = 0;

        res = money/50000;
        money = money%50000;
        if(res>0){
            System.out.println("오만원권: "+ res);
        }
        res = money/10000;
        money = money%10000;
        if(res>0){
            System.out.println("만원권: "+ res);
        }
        res = money/1000;
        money = money%1000;
        if(res>0){
            System.out.println("천원: "+ res);
        }
        res = money/100;
        money = money%100;
        if(res>0){
            System.out.println("백원: "+ res);
        }
        res = money/50;
        money = money%50;
        if(res>0){
            System.out.println("오십원: "+ res);
        }
        res = money/10;
        money = money%10;
        if(res>0){
            System.out.println("십원: "+ res);
        }
        res = money/1;
        if(res>0){
            System.out.println("일원: "+ res);
        }
    }
}
