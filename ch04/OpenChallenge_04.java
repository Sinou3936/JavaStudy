package ch04;

import java.util.Scanner;

public class OpenChallenge_04 {
    public static void main(String[] args) {
        WordGameApp app = new WordGameApp();
        app.run();
    }
}
class Player{
    Scanner scan = new Scanner(System.in);
    protected String word, name;

    public String getWordFormUser(){
        word = scan.next();
        return word;
    }
    public boolean checkSuccess(char lastchar){
        if(lastchar == word.charAt(0)) return true;
        else return false;
    }
}
class WordGameApp{
    Scanner scan = new Scanner(System.in);

    public void run(){
        String word = "아버지";

        System.out.println("끝말잇기를 시작합니다......");
        System.out.print("게임에 참가할 인원은 몇명입니까?>>> ");
        int member = scan.nextInt();
        Player player[] = new Player[member];

        for(int i=0; i<member; i++){
            System.out.print("참가자의 이름을 입력하세여>>");
            player[i] = new Player();
            player[i].name = scan.next();
        }
        System.out.println("시작하는 단어는 아버지 입니다.");

        int i=0,j;

        while (true){
            j = i% member;
            int lastIndex = word.length()-1;
            char lastChar = word.charAt(lastIndex);

            System.out.print(player[j].name +">>");
            player[j].getWordFormUser();
            boolean continues = player[j].checkSuccess(lastChar);
            if(continues == false){
                System.out.println(player[j].name+" 이(가) 졌습니다.");
                break;
            }
            word = player[j].word;
            i++;
        }
    }
}