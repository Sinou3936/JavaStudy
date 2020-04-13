package ch06;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(">>");
        String txt = scan.nextLine();
        StringBuffer sb = new StringBuffer(txt);

        while (true){
            System.out.print("명령: ");
            String cmd = scan.nextLine();
            if(cmd.equals("그만")){
                System.out.println("프로그램 종료");
                break;
            }
            String str[] = cmd.split("!");
            if(str.length != 2){
                System.out.println("잘못된 명령입니다.!");
            }else{
                if(str[0].length() == 0 || str[1].length() == 0){
                    System.out.println("잘못된 명령입니다.!");
                    continue;
                }
                int idx = sb.indexOf(str[0]);

                if (idx == -1){
                    System.out.println("찾을 수 없습니다.");
                    continue;
                }
                sb.replace(idx, idx+str[0].length(), str[1]);
                System.out.println(sb.toString());
            }
        }
        scan.close();
    }
}
