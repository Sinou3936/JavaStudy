package ch03;

public class ex1C {
    public static void main(String[] args) {
        DoWhileTest(0);
    }
    public static int DoWhileTest(int i){
        int sum = 0;

        do {
            sum +=i;
            i+=2;
        }while (i<100);

        System.out.println(sum);
        return  sum;
    }
}
