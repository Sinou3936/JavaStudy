package ch05;

public class ex7 {
    public static void main(String[] args) {
        Ponit3D p = new Ponit3D(1,2,3);
        System.out.println(p.toString() +" 입니다.");

        p.moveUp();
        System.out.println(p.toString() +" 입니다.");
        p.moveDown();
        p.move(10,10);
        System.out.println(p.toString() +" 입니다.");

        p.move(100,200,300);
        System.out.println(p.toString() +" 입니다.");
    }
}

class Ponit3D extends Point{
    private int z;

    public Ponit3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void moveUp(){
        this.z +=1;
    }
    public void moveDown(){
        this.z -=1;
    }

    @Override
    protected void move(int x, int y) {
        super.move(x, y);
    }
    protected void move(int x, int y, int z){
        super.move(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+z+") 의 점";
    }
}