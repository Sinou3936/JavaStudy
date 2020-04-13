package ch02;

import java.util.Scanner;

public class ch02Op {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("가위바위보 게임 입니다. 가위,바위 보 중에서 입력하세요.");
        System.out.print("철수: ");
        String s1 = scan.next();
        System.out.print("영희: ");
        String s2 = scan.next();

        if(s1.equals("바위")){
            if(s2.equals("가위")){
                System.out.println("철수가 이겼습니다.");
            }else if(s2.equals("바위")){
                System.out.println("비겼습니다.");
            }else if(s2.equals("보")){
                System.out.println("영희가 이겼습니다.");
            }
        }else if(s1.equals("가위")){
            if(s2.equals("가위")){
                System.out.println("비겼습니다.");
            }else if(s2.equals("바위")){
                System.out.println("영희가 이겼습니다.");
            }else if(s2.equals("보")){
                System.out.println("철수가 이겼습니다.");
            }
        }else if(s1.equals("보")){
            if(s2.equals("가위")){
                System.out.println("영희가 이겼습니다.");
            }else if(s2.equals("바위")){
                System.out.println("철수가 이겼습니다.");
            }else if(s2.equals("보")){
                System.out.println("비겼습니다.");
            }
        }
    }
}
