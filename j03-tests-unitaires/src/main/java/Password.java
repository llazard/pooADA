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
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        if (!hasLetter) {
            errors.add("Au moins une lettre");
        }

        return errors;
    }
}
