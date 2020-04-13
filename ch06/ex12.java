package ch06;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        GamblingGame game = new GamblingGame();
        game.run();
    }
}
class GamblingGame{
    private String name;
    private int num1, num2, num3;

    public GamblingGame(){}
    public GamblingGame(String name){
        this.name = name;
    }

    public boolean game(){
        num1 = (int)(Math.random()*3+1);
        num2 = (int)(Math.random()*3+1);
        num3 = (int)(Math.random()*3+1);

        System.out.print("\t"+num1+" "+num2+" "+num3+" ");
        if(num1 == num2 && num2 == num3) return  true;
        else return  false;
    }

    void run(){
        Scanner scan = new Scanner(System.in);
        System.out.print("겜블링 게임에 참여할 선수 숫자>>> ");
        int member = scan.nextInt();
        GamblingGame player[] = new GamblingGame[member];
        for(int i=0; i<member; i++){
            System.out.print((i+1)+"번쨰 선수이름>> ");
            String names = scan.next();
            player[i] = new GamblingGame(names);
        }
        String buff = scan.nextLine();
        while (true){
            for (int i=0; i<member; i++){
                System.out.print("["+player[i].name+": <Enter> 키");
                buff = scan.nextLine();
                if(player[i].game()){
                    System.out.println(player[i].name+" 님이 이겼습니다.");
                    scan.close();
                    return;
                }
                System.out.println("아쉽군요!");
            }
        }

    }
}