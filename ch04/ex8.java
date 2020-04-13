package ch04;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.run();
    }
}
class Phone{
    private String name,number;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Phone(String name, String number){
        this.name = name;
        this.number = number;
    }
}
class PhoneBook{
    Phone phone[];
    Scanner scan;

    public PhoneBook(){
        scan = new Scanner(System.in);
    }


    public void input(){
        System.out.print("인원수>>");
        int member = scan.nextInt();
        phone = new Phone[member];

        for(int i=0; i<phone.length; i++){
            System.out.print("이름과 전화번호(이름과 번호는 공백없이 입력)>>");
            String name = scan.next();
            String tel = scan.next();

            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장 되었습니다.");
    }
    public String search(String name){
        for(int i=0; i<phone.length; i++){
            if(name.equals(phone[i].getName()))
                return phone[i].getNumber();
        }
        return null;
    }

    public void run(){
        input();
        while (true){
            System.out.print("검색할 이름>>");
            String name= scan.next();
            if(name.equals("그만")){
                System.out.println("종료...");
                break;
            }
            String tel = search(name);

            if(tel != null)
                System.out.println(name+" 의 번호는 "+ tel + " 입니다.");
            else{
                System.out.println(name+ " 이(가) 없습니다.");
            }
        }
    }
}