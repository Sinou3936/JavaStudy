package ch04;

public class ex1 {
    public static void main(String[] args) {
        TV myTv = new TV("LG",2017,32);
        myTv.show();
    }
}

class TV{
    private String name;
    private int year;
    private int in;

    public TV(String name, int year, int in){
        this.name = name;
        this.year =year;
        this.in = in;
    }

    public void show(){
        System.out.println(name+" 에서 만든 "+ year+" 년형 "+ in +" 인치 TV");
    }
}