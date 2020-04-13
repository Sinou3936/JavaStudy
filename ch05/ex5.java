package ch05;

public class ex5 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"yellow");
        cp.setXY(10,20);
        cp.setColor("RED");
        String str= cp.toString();
        System.out.println(str+" 입니다.");
    }
}

class Point{
    private int x,y;
    public Point(int x, int y){this.x = x; this.y=y;}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y){this.x =x; this.y=y;}
}

class ColorPoint extends Point{
    private  String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public ColorPoint(){
        super(0,0);
        this.color = "black";
    }
    public ColorPoint(int x, int y){
        super(x,y);
    }

    protected void setXY(int x, int y) {
        super.move(x, y);
    }
    protected void setColor(String color){
        this.color =color;
    }

    @Override
    public String toString() {
        return  color +" 색의 ("+ getX()+ ","+ getY()+")의 점";
    }
}