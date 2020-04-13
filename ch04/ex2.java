package ch04;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int m = scan.nextInt();
        int s = scan.nextInt();
        int e = scan.nextInt();
        Grade me = new Grade(m,s,e);
        System.out.println("평균은: "+ me.average());

        scan.close();
    }
}
class Grade {
    private int math;
    private int science;
    private int english;

    public Grade(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english =english;
    }
    public int average(){
        int sum = 0;
        sum = (math+science+english);

        return  sum/3;
    }
}