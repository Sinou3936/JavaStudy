package ch06;

public class ex2 {
    public static void main(String[] args) {
        Circle a = new Circle(2,3,5);
        Circle b = new Circle(2,3,30);
        System.out.println("원 a: "+ a.toString());
        System.out.println("원 b: "+ b.toString());

        if(a.equals(b)){
            System.out.println("같은 원");
        }else{
            System.out.println("서로 다른 원");
        }
    }
}

class Circle{
    private int x,y,z;

    public Circle(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        String str = "Circle("+x+","+y+")";
        return  str;
    }
}
