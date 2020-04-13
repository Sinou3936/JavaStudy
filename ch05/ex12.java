package ch05;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.run();
    }
}

abstract class Shapes{
    private Shapes next;
    public Shapes() {next = null;}
    public void setNext(Shapes obj) {next = obj;}

    public Shapes getNext() { return next; }
    public abstract void draw();
}
class Line extends Shapes{

    @Override
    public void draw() {
        System.out.println("line");
    }
}
class Rect extends Shapes{

    @Override
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shapes{

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class GraphicEditor{
    private Shapes head, tail;
    private Scanner sc;
    public GraphicEditor(){
        head = null;
        tail = null;
        sc= new Scanner(System.in);
    }

    void run(){
        System.out.println("그래픽 에디터 beauty을 실행 합니다.");
        while (true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int n = sc.nextInt();
            if(n == 4) {
                System.out.println("프로그램 종료...");
                break;
            }

            if(n == 1){
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                int select = sc.nextInt();
                input(select);
            }else if(n == 2){
                System.out.print("삭제할 도형의 위치>>");
                int local = sc.nextInt();
                delete(local);
            }else if(n == 3){
                print();
            }
        }
    }
    void input(int draw){
        Shapes grapic = null;
        switch (draw){
            case 1:
                grapic = new Line();
                break;
            case 2:
                grapic = new Rect();
                break;
            case 3:
                grapic = new Circle();
                break;
            default:
                System.out.println("다시 입력하세요..");
                return;
        }
        if(head == null){
            head = grapic;
            tail = grapic;
        }else{
            tail.setNext(grapic);
            tail = grapic;
        }
    }
    void print(){
        Shapes s = head;
        while (s!=null){
            s.draw();
            s = s.getNext();
        }
    }
    void delete(int num){
        Shapes current = head;
        Shapes temp = head;
        int i=0;
        if(num ==1){
            if(head == tail){
                head = null;
                tail = null;
                return;
            }else{
                head = head.getNext();
                return;
            }
        }
        for(i=1; i<num; i++) {
            temp = current;
            current = current.getNext();
            if (current == null){
                System.out.println("삭제 할 수 없습니다.");
                return;
            }
        }
        if(i == num){
            temp.setNext(current.getNext());
            tail = temp;
        }
        else{
            temp.setNext(current.getNext());
        }
    }
}