package ch03;

public class ex10 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int tmp1,tmp2;
        int cnt =0;

       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++)
               arr[i][j] = (int)(Math.random()*10+1);
       }
       while (cnt <7){
           tmp1 = (int)(Math.random()*3);
           tmp2 = (int)(Math.random()*3);
           if(arr[tmp1][tmp2] !=0){
               arr[tmp1][tmp2] = 0;
               cnt++;
           }
       }

       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
}
