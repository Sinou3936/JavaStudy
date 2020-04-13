package ch03;

public class ex12 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("인자 없어서 수행을 못합니다.");
            return;
        }

        int sum = 0;

        for(int i=0; i<args.length; i++){
            try {
                int n = Integer.parseInt(args[i]);
                sum = sum + n;
            }catch (Exception e){

            }
        }
        System.out.println("합계: "+sum);
    }
}
