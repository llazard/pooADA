package playlist;

public class Main {
    public static void main(String[] args) {
        Artist queen = new Artist("Queen");
        Song song = new Song("Bohemian Rhapsody", 355, queen);
        System.out.println(song.getInformation());
    }
}
