package ch03;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("금액을 입력하세여>> ");
        int n = scan.nextInt();

        int unit[] = {50000,10000,1000,100,10,1};
        int res = 0;
        for(int i=0; i<unit.length; i++){
            res = n/unit[i];
            n = n%unit[i];
            if(res> 0){
                System.out.println(unit[i]+"짜리: "+ res);
            }
        }
    }
}
