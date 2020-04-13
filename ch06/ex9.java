package ch06;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        playGame game = new playGame();
        game.run();

    }
}
class Player{
    private String name;
    private Scanner scan = new Scanner(System.in);

    public Player(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public int turn(){
        System.out.print("가위(1) 바위(2) 보(3) 끝내기(4) >>");
        return scan.nextInt();
    }
}
class Computer extends Player{

    public Computer(String name) {
        super(name);
    }

    @Override
    public int turn() {
        return (int)(Math.random()*3+1);
    }
}
class playGame{
    private final String s[] ={"가위","바위","보"};
    private Player players[] = new Player[2];

    public playGame(){
        players[0] = new Player("철수");
        players[1] = new Computer("CPU");
    }

    protected void run(){
        int use, cpu;
        while (true){
            use = players[0].turn();
            if(use == 4){
                System.out.println("프로그램 종료!!!!");
                break;
            }
            cpu = players[1].turn();

            if(use < 1 || use >3){
                System.out.println("잘못 입력 하였습니다.");
            }else {
                System.out.print(players[0].getName()+"("+ s[use-1]+") "+" : ");
                System.out.println(players[1].getName()+"("+ s[cpu-1]+") ");

                int diff = use - cpu;
                switch (diff){
                    case 0:
                        System.out.println("비겼습니다.");
                        break;
                    case -1:
                    case 2:
                        System.out.println(players[0].getName()+" 가 이겼습니다.");
                        break;
                    case 1:
                    case -2:
                        System.out.println(players[1].getName()+" 가 이겼습니다.");
                }
            }
        }
    }
}
