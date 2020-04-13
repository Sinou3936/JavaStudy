package ch05;

public class ex4 {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
class Km2Mile extends Converter{

    private double mile;

    public Km2Mile(double mile){
        this.mile = mile;
    }

    @Override
    protected double convert(double src) {
        return src/mile;
    }

    @Override
    protected String getSrcString() {
        return "KM";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}