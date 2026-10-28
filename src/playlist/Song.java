package playlist;

public class Song {
    private final String title;
    private final int durationSeconds;
    private final Artist artist; // un attribut qui est un objet
    public Song(String title, int durationSeconds, Artist artist) {
        this.title = title;
        this.durationSeconds = durationSeconds;
        this.artist = artist;
    }
    public int getDurationSeconds() { return durationSeconds; }
    public Artist getArtist() { return artist; }
    public static String format(int seconds) {
        return seconds / 60 + ":" + String.format("%02d", seconds % 60);
    }
    public String getInformation() {
        return title + " - " + artist.getName() + " (" + format(durationSeconds) + ")";
    }
}
