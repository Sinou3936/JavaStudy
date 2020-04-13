package ch04;

public class ex3 {
    public static void main(String[] args) {
        Song song = new Song("Dancing Queen", "ABBA", 1978,"스웨덴");
        Song song2 = new Song();
        song.show();
        System.out.println();
        song2.show();
    }
}
class Song{
    private String title;
    private String artist;
    private String country;
    private int year;

    public Song(String title, String artist, int year, String country){
        this.title = title; this.artist = artist; this.year = year; this.country =country;
    }
    public void show(){
        System.out.println(year+" 년 "+ country+"국적의 "+ artist+"가 부른 "+ title);
    }
    public Song(){
        title = "Dancing Queen";
        artist = "ABBA";
        country = "스웨덴";
        year = 1978;
    }
}