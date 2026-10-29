package playlist;

public class Main {
    public static void main(String[] args) {
        Artist queen = new Artist("Queen");
        Artist stromae = new Artist("Stromae");

        Song rhapsody = new Song("Bohemian Rhapsody", 355, queen);
        Song dontStop = new Song("Don't Stop Me Now", 209, queen);
        Song papaoutai = new Song("Papaoutai", 232, stromae);

        Playlist playlist = new Playlist("Ma playlist");
        playlist.add(rhapsody);
        playlist.add(dontStop);
        playlist.add(papaoutai);
        playlist.print();
        System.out.println("Titres de Queen : " + playlist.songsBy(queen).size());
        System.out.println("Le plus long : " + playlist.longest().getInformation());

        // Étape 2 : les deux chansons partagent le même objet Artist.
        queen.rename("Queen + Adam Lambert");
        playlist.print();
        Artist otherQueen = new Artist("Queen + Adam Lambert");
        System.out.println("Titres de queen : " + playlist.songsBy(queen).size());
        System.out.println("Titres de otherQueen : " + playlist.songsBy(otherQueen).size());

        // Étape 3 : la copie protège la liste interne.
        try {
            playlist.getSongs().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("clear() refusé, la playlist a toujours " + playlist.size() + " titres");
        }

        // Partie optionnelle
        Album album = new Album("Racine carrée", stromae);
        album.addSong(papaoutai);
        System.out.println(album.getInformation());
    }
}
