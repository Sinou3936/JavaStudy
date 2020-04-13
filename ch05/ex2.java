package ch05;

public class ex2 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2",32,2048);
        iptv.printProperty();
    }
}
class IPTV extends ColorTV{
    private String ipaddress;
    public IPTV(String ip,int size, int color) {
        super(size, color);
        this.ipaddress = ip;
    }

    @Override
    public void printProperty() {
        System.out.print("나의 IPTV 는 "+ ipaddress+"주소의 ");
        super.printProperty();
    }
}