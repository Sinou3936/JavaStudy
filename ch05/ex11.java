package ch05;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result;
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = scan.nextInt();
        int b = scan.nextInt();
        String s = scan.next();
        Calc c = null;

        switch (s){
            case "+":
                c = new Add();
                break;
            case "-":
                c = new Sub();
                break;
            case "*":
                c = new Mul();
                break;
            case "/":
                c = new Div();
                break;
        }
        c.setValue(a,b);
        result = c.calculate();
        System.out.println(result);
    }
}

abstract class Calc{
    protected  int a,b;
     void setValue(int a, int b){
        this.a= a;
        this.b= b;
        }
    abstract int calculate();
}
class Add extends Calc{
    @Override
    int calculate() {
        return a+b;
    }
}
class Sub extends Calc{

    @Override
    int calculate() {
        return a-b;
    }
}
class  Mul extends Calc{

    @Override
    int calculate() {
        return a*b;
    }
}
class Div extends Calc{

    @Override
    int calculate() {
        if(b == 0)
            return -1;
        return a/b;
    }
}
