package ch06;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Person games = new Person();
        games.run();
    }
}
class Person{
    private String name;
    private int num1, num2, num3;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }
    public boolean game(){
        num1 = (int)(Math.random()*3+1);
        num2 = (int)(Math.random()*3+1);
        num3 = (int)(Math.random()*3+1);
        System.out.print("\t "+num1+" "+num2+" "+num3+" ");

        if(num1 == num2 && num2 == num3){
            return true;
        }else{
            return false;
        }
    }

    void run(){
        Scanner scan = new Scanner(System.in);
        System.out.print("1번쨰 선수>> ");
        String name1 = scan.next();
        Person p1 = new Person(name1);
        System.out.print("2번쨰 선수>> ");
        String name2 = scan.next();
        Person p2 = new Person(name2);
        String buffer = scan.nextLine();

        while (true){
            System.out.print("["+p1.name+"]: <<Enter 키>");
            buffer = scan.nextLine();
            if(p1.game()){
                System.out.println(p1.name+" 님이 이겼습니다.");
                break;
            }
            System.out.println("아쉽군요");
            System.out.print("["+p2.name+"] : <<Enter 키>");
            buffer = scan.nextLine();
            if(p2.game()){
                System.out.println(p2.name+" 님이 이겼습니다.");
                break;
            }
            System.out.println("아쉽군요!");
        }
        scan.close();

    }
}