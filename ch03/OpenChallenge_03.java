package ch03;

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        while (true){
            System.out.println("수를 결정하였습니다. 맞추어 보세요.");
            int min = 0;
            int max = 99;
            int k = r.nextInt(100);
            System.out.println(min +" - "+ max );
            int cnt =1;
            System.out.print(cnt+">>");
            int n = scan.nextInt();

            while (k != n){
                if(k < n){
                    System.out.println("더 낮게");
                    max = n;
                }else {
                    System.out.println("더 높게");
                    min = n;
                }
                cnt++;
                System.out.println(min +" - "+max);
                System.out.print(cnt+">>");
                n = scan.nextInt();
            }
            System.out.println("맞았습니다.");
            System.out.print("다시 시작하겟습니까(y/n)>>");
            String str = scan.next();
            if(str.equals("n")){
                System.out.println("게임 종료"); break;
            }else if(str.equals("y")){
                System.out.println("게임 재개"); continue;
            }else{
                System.out.println("다시 입력"); continue;
            }
        }
    }
}
