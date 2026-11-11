package playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private final String name;
    private final List<Song> songs = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void add(Song song) {
        songs.add(song);
    }

    public int size() {
        return songs.size();
    }

    public String getTotalDuration() {
        int total = 0;
        for (Song song : songs) {
            total += song.getDurationSeconds();
        }
        return Song.format(total);
    }

    // On compare les objets Artist avec == : le même objet, pas le même nom.
    public List<Song> songsBy(Artist artist) {
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getArtist() == artist) {
                result.add(song);
            }
        }
        return result;
    }

    public Song longest() {
        Song longest = null;
        for (Song song : songs) {
            if (longest == null || song.getDurationSeconds() > longest.getDurationSeconds()) {
                longest = song;
            }
        }
        return longest;
    }

    // Étape 3 : une copie en lecture seule, la liste interne reste protégée.
    public List<Song> getSongs() {
        return List.copyOf(songs);
    }

    public void print() {
        System.out.println(name + ", " + size() + " titres, " + getTotalDuration());
        for (Song song : songs) {
            System.out.println("  " + song.getInformation());
        }
    }
}
