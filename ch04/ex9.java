package ch04;

public class ex9 {
    public static void main(String[] args) {
        int arr1[] = {1,5,7,9};
        int arr2[] = {3,6,-1,100,77};
        int arr3[] = ArrayUtil.concat(arr1,arr2);
        ArrayUtil.print(arr3);
    }
}
class ArrayUtil{
    public static int[] concat(int a[], int b[]){
        int sum[] = new int[a.length+b.length];
        for(int i=0; i<a.length+b.length; i++) {
            if(i<a.length){
                sum[i] = a[i];
            }else{
                sum[i] = b[i-a.length];
            }
        }
        return sum;
    }
    public static void print(int [] a){
        System.out.print("[");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("]");
    }
}