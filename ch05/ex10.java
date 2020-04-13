package ch05;

public class ex10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태","자바");
        dic.put("이재문","파이썬");
        dic.put("이재문","C++");
        System.out.println("이재문의 값은 "+ dic.get("이재문"));
        System.out.println("황기태의 값은 "+ dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+ dic.get("황기태"));

    }
}
abstract class PairMap{
    protected  String keyArray[];
    protected  String valueArray[];
    abstract String get(String key);
    abstract void put(String key, String val);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap{

    private int set;

    public Dictionary(int set){
        this.set = 0;
        keyArray = new String[set];
        valueArray = new String[set];
    }

    @Override
    String get(String key) {
        for(int i=0; i<keyArray.length; i++) {
            if(key.equals(keyArray[i])){
               return valueArray[i];
            }
        }
        return null;
    }
    @Override
    void put(String key, String val) {
        for(int i=0; i<keyArray.length; i++){
            if(key.equals(keyArray[i])){
                keyArray[i] = key;
                valueArray[i] = val;
                return;
            }
        }
        keyArray[set] = key;
        valueArray[set] = val;
        set++;
    }

    @Override
    String delete(String key) {
        for(int i=0; i<keyArray.length; i++){
            if(key.equals(keyArray[i])){
                String s = valueArray[i];
                keyArray[i] = null;
                valueArray[i] = null;
                return  s;
            }
        }
        return null;
    }

    @Override
    int length() {
        return set;
    }
}