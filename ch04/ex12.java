package ch04;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        콘서트 sr = new 콘서트();
        Scanner scan = new Scanner(System.in);
        System.out.println("명품콘서트 홀 예약 시스템입니다.");
        while (true){
            System.out.print("예약:1, 조회:2. 취소:3, 끝내기:4 >> ");
            int select = scan.nextInt();

            switch (select){
                case 1:
                    sr.예약();
                    break;
                case 2:
                    sr.조회();
                    break;
                case 3:
                    sr.취소();
                    break;
                case 4:
                    return;
                    default:
                        System.out.println("잘못 입력하엿습니다.");
                        continue;
            }
        }
    }
}
class 콘서트 {
    Scanner scan = new Scanner(System.in);
    String seats[][] = new String[3][10];

    콘서트(){
        for(int i=0; i<seats.length; i++){
            for(int j=0; j<seats[i].length; j++){
                this.seats[i][j] = "----";
            }
        }
    }
    public void seatWatch(int chair){
        switch (chair){
            case 1:
                System.out.print("S>> ");
                break;
            case 2:
                System.out.print("A>> ");
                break;
            case 3:
                System.out.print("B>> ");
                break;
        }
        for(int i=0; i<seats[0].length; i++)
            System.out.print(this.seats[chair-1][i]+" ");
        System.out.println();
    }

    public void 예약(){
        int chair;
        String name = null;
        int chair_num;
        while (true){
            System.out.print("좌석 구분 S(1), A(2), B(3)>> ");
            chair = scan.nextInt();

            try{
                seatWatch(chair);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("다시 선택 해주세요");
                continue;
            }

            seatWatch(chair);
            System.out.print("이름>> ");
            name = scan.next();
            System.out.print("번호>> ");
            chair_num = scan.nextInt();


            if(chair_num >10 || chair_num <1){
                System.out.println("좌석 번호를 다시 입력 하세요");
                continue;
            }
            if(!this.seats[chair-1][chair_num-1].equals("----")){
                System.out.println("이미 좌석이 차 있습니다.");
                continue;
            }
            try{
                this.seats[chair-1][chair_num-1] = name;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("좌석 번호를 다시 입력하세요");
                continue;
            }
            return;
        }
    }

    public int 동명이인(String name){
        int cnt =0;
        for(int i=0; i<seats.length; i++){
            for(int j=0; j<seats[i].length; j++){
                if(this.seats[i][j].equals(name)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void 조회(){
        for(int i=0; i<seats.length; i++){
            if(i==0)
                System.out.print("S>> ");
            else if(i==1)
                System.out.print("A>> ");
            else if(i==2)
                System.out.print("B>> ");
            for(int j=0; j<seats[i].length; j++){
                System.out.print(this.seats[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("조회 완료하였습니다.--------");
    }
    public void 취소(){
        int chair;
        int name_cnt;
        int chair_num;
        String name = null;

        while (true){
            System.out.print("좌석 S:1, A:2, B:3 >> ");
            chair = scan.nextInt();
            seatWatch(chair);

            System.out.print("이름>> ");
            name = scan.next();
            name_cnt = 동명이인(name);


            if(name_cnt >1){
                System.out.println("동명이인이 잇습니다.");
                System.out.print("취소 할 좌석 번호를 입력하세요>>");
                chair_num = scan.nextInt();

                if(!this.seats[chair-1][chair_num-1].equals(name)){
                    System.out.println("잘못 입력 하엿습니다.");
                    continue;
                }else {
                    this.seats[chair-1][chair_num-1] = "----";
                    return;
                }
            }else {
                for(int i=0; i<seats.length; i++){
                    for(int j=0; j<seats[i].length; j++){
                        if(this.seats[i][j].equals(name)){
                            this.seats[i][j] = "----";
                            return;
                        }
                    }
                }
                System.out.println("예약된 이름이 없습니다.");
            }
        }
    }
}
