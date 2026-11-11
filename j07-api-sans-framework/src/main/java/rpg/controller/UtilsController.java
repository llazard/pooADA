package rpg.controller;

// Ce qui sert à plusieurs contrôleurs.
public class UtilsController {

    // Cherche dans la query le filtre name : "name=merl" donne "merl".
    // Un autre filtre donne null.
    public static String readName(String query) {
        String[] filter = query.split("="); // ["name", "merl"]
        if (filter[0].equals("name")) {
            return filter[1];
        }
        return null;
    }

    // Cherche dans la query le filtre role : "role=mage" donne "mage".
    // Un autre filtre donne null.
    public static String readRole(String query) {
        String[] filter = query.split("="); // ["role", "mage"]
        if (filter[0].equals("role")) {
            return filter[1];
        }
        return null;
    }
}
