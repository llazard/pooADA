package playlist;

import java.util.ArrayList;
import java.util.List;

// Partie optionnelle : un album a un artiste, et refuse les titres des autres.
public class Album {

    private final String title;
    private final Artist artist;
    private final List<Song> songs = new ArrayList<>();

    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    public void addSong(Song song) {
        if (song.getArtist() != artist) {
            throw new IllegalArgumentException(song.getInformation() + " n'est pas de " + artist.getName());
        }
        songs.add(song);
    }

    public String getInformation() {
        return title + " de " + artist.getName() + ", " + songs.size() + " titre(s)";
    }
}
