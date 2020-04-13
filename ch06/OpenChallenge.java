package ch06;

import java.util.Scanner;

public class OpenChallenge {
    public static void main(String[] args) {
        HistoGram his = new HistoGram();

        his.setAlpha();
        System.out.println("영문 테스트를 입력하고, 세미콜론을 입력하세요.");
        his.Count(his.readString());
        his.draw();
    }
}
class Alpha{
    private char alpha;
    private int cnt = 0;
    public Alpha(char a){
        this.alpha = a;
    }

    public char getAlpha() {
        return alpha;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getCnt() {
        return cnt;
    }
}
class HistoGram{
    protected Alpha[]  alpha;
    protected  char a = 'A';

    void setAlpha() {
        alpha = new Alpha[26];
        for(int i=0; i<alpha.length; i++){
            alpha[i] = new Alpha(a);
            a++;
        }
    }
    String readString(){
        StringBuffer sb = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        while (true){
            String line = scan.nextLine();
            if(line.length() == 1 && line.charAt(0)==';') break;
            sb.append(line);
        }
        return sb.toString();
    }

    void Count(String a){
        int num =0; char a1 = 'A', a2='a';

        while (num <26){
            int cnt = 0;
            for (int i=0; i<a.length(); i++){
                if(a.charAt(i) == a1 || a.charAt(i) == a2){
                    cnt++;
                }
            }
            alpha[num].setCnt(cnt);
            num++; a1++; a2++;
        }
    }
    void draw(){
        System.out.println("\n 히스토 그램을 그립니다.");
        for(int i=0; i<alpha.length; i++){
            System.out.print(alpha[i].getAlpha());
            for(int j=0; j<alpha[i].getCnt(); j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
