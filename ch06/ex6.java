package ch06;

import java.util.Calendar;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        System.out.println("10초에 가까운 사임 이기는 게임 입니다.");

        person p1 = new person("황기태");
        person p2 = new person("이재문");

        int result1 = p1.game();
        int result2 = p2.game();

        if(Math.abs(result1-10) < Math.abs(result2 -10)) {
            System.out.println("황기태 결과 " + result1 + ", 이재문의 결과 " + result2
                    + ", 승자는 황기태");
        }else{
            System.out.println("황기태 결과 "+result1 +", 이재문의 결과 "+ result2
                    +", 승자는 이재문");
        }

    }
}
class person{
    Calendar now = Calendar.getInstance();
    Scanner scan = new Scanner(System.in);
    private String name, buf;
    private int sec1, sec2;

    public person(String name){
        this.name = name;
    }

    public int game(){
        System.out.print(name+" 시작 <Enter키>>");
        sec1 = enter();
        System.out.print("10초 예상 후 <Enter키>>");
        sec2 = enter();

        if(sec1 < sec2)
            return  sec2 -sec1;
        else
            return (60-sec1) + sec2;
    }

    public int enter(){
        buf = scan.nextLine();
        now = Calendar.getInstance();
        System.out.println("\t 현재 초 시간 = "+ now.get(Calendar.SECOND));
        return  now.get(Calendar.SECOND);
    }
}
