package ch04;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하세요>>");
        int a = scan.nextInt();
        int b = scan.nextInt();
        String c = scan.next();
        if(c.equals("+")){
            Add add = new Add();
            add.setValue(a,b);
           System.out.println(add.calculate());
        }
        else if(c.equals("-")){
            Sub sub = new Sub();
            sub.setValue(a,b);
            System.out.println(sub.calculate1());
        }
        else if(c.equals("*")){
            Mul mul = new Mul();
            mul.setValue(a,b);
            System.out.println(mul.calculate2());
        }
        else if(c.equals("/")){
            Div div = new Div();
            div.setValue(a,b);
            System.out.println(div.calculate3());
        }
    }
}
class Add{
    private int a,b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return  a+b;
    }
}
class Sub{
    private int a,b;

    public void setValue(int a, int b){
        this.a =a;
        this.b =b;
    }
    public int calculate1(){
        return  a-b;
    }
}
class Mul{
    private int a,b;

    public void setValue(int a, int b){
        this.a =a;
        this.b =b;
    }
    public int calculate2(){
        return  a*b;
    }
}class Div{
    private int a,b;

    public void setValue(int a, int b){
        this.a =a;
        this.b =b;
    }
    public int calculate3(){
        if(b==0){
            return 0;
        }
        return a/b;
    }
}