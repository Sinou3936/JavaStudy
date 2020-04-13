package ch03;

public class ex1A {
    public static void main(String[] args) {
        WhileTest(0);
    }
    public static int WhileTest(int i){
        int sum = 0;

        while (i<100){
            sum = sum+i;
            i+=2;
        }
        System.out.println(sum);
        return  sum;
    }
}
