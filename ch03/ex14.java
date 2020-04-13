package ch03;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        String course[] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("과목 이름>>");
            String str = scan.nextLine();

            if (str.equals("그만")) break;
            int i = 0;
            for (i = 0; i < course.length; i++) {
                if (course[i].equals(str)) {
                    System.out.println(str + " 의 점수는 " + score[i]);
                    break;
                }
            }

            if(i == course.length)
                System.out.println("잘못 입력된 과목 입니다.");
        }
    }
}
