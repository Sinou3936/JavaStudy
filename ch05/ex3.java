package ch05;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Won2Dallor toDallor = new Won2Dallor(1200);
        toDallor.run();
    }
}

abstract class Converter{
    abstract protected  double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected  double ratio;

    public void run(){
        Scanner scan = new Scanner(System.in);
        System.out.println(getSrcString()+" 을 "+ getDestString()+ " 로 바꿉니다.");
        System.out.print(getSrcString()+" 을 입력하세여>>>");
        double val = scan.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+ res+getDestString()+ " 입니다.");
        scan.close();
    }
}
class Won2Dallor extends Converter{

    private int won;

    public Won2Dallor(int won){
        this.won = won;
    }

    @Override
    protected double convert(double src) {
        return (double)src/won;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
}