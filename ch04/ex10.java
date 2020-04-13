package ch04;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Dictionary dir = new Dictionary();
        dir.run();
    }
}
class Dictionary{
    private static String kor[] = {"사랑","아기","돈","미래","희망"};
    private static String eng[] = {"love","baby","money","future","hope"};

    private static String kor2Eng(String word){
        for(int i=0; i<kor.length; i++){
            if(word.equals(kor[i]))
                return eng[i];
        }
        return  null;
    }

    public void run(){
        Scanner scan = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while (true){
            System.out.print("한글단어?");
            String str = scan.next();

            if(str.equals("그만")){
                System.out.println("프로그램 종료");
                break;
            }
            String eng = Dictionary.kor2Eng(str);
            if(eng != null){
                System.out.println(str+"는"+ eng);
            }else{
                System.out.println(str+" 은/는 저의 단어에 없습니다.");
            }
        }
    }
}