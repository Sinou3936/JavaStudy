package ch05;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
       StackApp stackApp = new StackApp();
       stackApp.run();
    }
}
interface Stack{
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

class StringStack implements Stack{

    private int size;
    private int set;
    private String stack[];

    public StringStack(int size){
        this.size = size;
        this.set = 0;
        stack = new String[size];
    }
    @Override
    public int length() {
        return set;
    }

    @Override
    public int capacity() {
        return size;
    }

    @Override
    public String pop() {
        if(set-1 <0)
            return null;
        --set;
        String str = stack[set];
        return str;
    }

    @Override
    public boolean push(String val) {
        if(set<size){
            stack[set] = val;
            set++;
            return true;
        }else{
            return false;
        }
    }
}
class StackApp{

    public void run(){
        Scanner scan = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력>> ");
        int n = scan.nextInt();
        StringStack stack = new StringStack(n);

        while (true){
            System.out.print("문자열 입력>>");
            String push = scan.next();
            if(push.equals("그만")) break;
            if(!stack.push(push)){
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }
        System.out.print("스택에 저장된 모든 문자열 팝: ");
        int len = stack.length();
        for(int i=0; i<len; i++){
            String pop = stack.pop();
            System.out.print(pop +" ");
        }

        scan.close();
    }
}