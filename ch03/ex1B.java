package ch03;

public class ex1B {
    public static void main(String[] args) {
        Fortest(0);
    }
    public static int Fortest(int i){
        int sum =0;

        for(; i<100; i+=2){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
