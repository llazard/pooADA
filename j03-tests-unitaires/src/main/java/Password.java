import java.util.ArrayList;
import java.util.List;

public class Password {

    // Renvoie la liste des règles non respectées. Liste vide : le mot de passe est valide.
    public static List<String> check(String password) {
        List<String> errors = new ArrayList<>();

        if (password.length() < 12) {
            errors.add("Au moins 12 caractères");
        }

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasSpace = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (c == ' ') {
                hasSpace = true;
            } else {
                hasSpecial = true;
            }
        }
        if (!hasLetter) {
            errors.add("Au moins une lettre");
        }
        if (!hasDigit) {
            errors.add("Au moins un chiffre");
        }
        if (!hasSpecial) {
            errors.add("Au moins un caractère spécial");
        }
        if (hasSpace) {
            errors.add("Aucun espace");
        }

        return errors;
    }
}
