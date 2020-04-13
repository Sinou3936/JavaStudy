package ch03;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 몇개?>> ");

        int n = scan.nextInt();
        int arr[] = new int[n];
        int temp =0, i = 0;
        boolean flag = false;


        while (i<n-1){
            temp = (int)(Math.random()*100+1);
            for(int j=0; j<i; j++){
                if(temp == arr[i]){
                    flag =true;
                    break;
                }else{
                    flag = false;
                }
            }
            if(flag == true) continue;
            else {
                arr[i] = temp;
                i++;
            }
        }
        int cnt = 1;
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
            cnt++;
            if(cnt==11){
                System.out.println();
                cnt=1;
            }
        }
    }
}
