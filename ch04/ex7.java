package ch04;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
class Day{
    private String work;

    public void setWork(String work) {
        this.work = work;
    }
    public String get(){
        return  work;
    }
    public void show(){
        if(work == null)
            System.out.println("없습니다.");
        else
            System.out.println(work+" 입니다.");
    }
}
class MonthSchedule{
    private  int x;
    Day day[];

    public MonthSchedule(int x){
        this.x =x;
        day = new Day[x];

        for(int i=0; i<day.length; i++){
            day[i] = new Day();
        }
    }
    Scanner scan = new Scanner(System.in);

    public void input(){
        System.out.print("날짜(1~30)?");
        int date = scan.nextInt();
        System.out.print("할 일(빈칸 없이 입력)?");
        String work = scan.next();
        date--;
        day[date].setWork(work);
    }
    public void view(){
        System.out.print("날짜(1~30)?");
        int date = scan.nextInt();
        date--;
        System.out.print((date+1)+"일의 할 일은 ");
        day[date].show();
    }
    public void finish(){
        System.out.println("프로그램 종료...");
    }
    public void run(){
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while (true){
            System.out.print("할 일(입력:1, 보기:2, 끝내기:3)>>");
            int num = scan.nextInt();

            if(num == 1) input();
            else if(num ==2) view();
            else if(num ==3) {
                finish();
                break;
            }
            else {
                System.out.println("다시 입력!!");
            }
        }
    }
}