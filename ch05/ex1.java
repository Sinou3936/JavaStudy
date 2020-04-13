package ch05;

public class ex1 {
    public static void main(String[] args) {
        ColorTV mytv = new ColorTV(32,1024);
        mytv.printProperty();
    }
}

class TV{
    private int size;
    public TV(int size) {this.size = size;}
    protected int getSize() { return size; }
}

class ColorTV extends TV{
    private int color;
    public ColorTV(int size, int color) {
        super(size);

        this.color =color;
    }

    protected int getColor() {
        return color;
    }

    public void printProperty(){
        System.out.println(getSize() +" 인치 "+ color+" 컬러");
    }
}