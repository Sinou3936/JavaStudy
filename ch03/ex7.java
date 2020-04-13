package ch03;

public class ex7 {
    public static void main(String[] args) {
        int n[] = new int[10];

        System.out.print("랜덤한 정수들: ");
        for(int i=0; i<n.length; i++){
            n[i] = (int)(Math.random()*10+1);
            System.out.print(n[i]+" ");
        }
        System.out.println();
        int sum = 0;
        int avg = 0;
        for(int i=0; i<n.length; i++){
            sum += n[i];
        }
        avg = sum/n.length;
        System.out.print("평균: "+ (double)avg);
    }
}
