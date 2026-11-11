import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordTest {

    // --- fournis ---

    @Test
    void check_validPassword_noError() {
        List<String> errors = Password.check("Azerty123!xyz");
        assertTrue(errors.isEmpty());
    }

    @Test
    void check_tooShort_oneError() {
        List<String> errors = Password.check("Azerty1!");
        assertEquals(1, errors.size());
        assertTrue(errors.contains("Au moins 12 caractères"));
    }

    // --- question 0 : écrit ensemble, puis on ajoute la règle « Au moins un chiffre » ---

    @Test
    void check_noDigit_oneError() {
        List<String> errors = Password.check("Azertyuiop!xyz");
        assertEquals(1, errors.size());
        assertTrue(errors.contains("Au moins un chiffre"));
    }

    // --- question 1 : la ligne que la couverture montre en rouge ---

    @Test
    void check_noLetter_oneError() {
        List<String> errors = Password.check("123456789!123");
        assertEquals(1, errors.size());
        assertTrue(errors.contains("Au moins une lettre"));
    }

    // --- question 2 : caractère spécial ---

    @Test
    void check_noSpecialCharacter_oneError() {
        List<String> errors = Password.check("Azerty123xyzw");
        assertEquals(1, errors.size());
        assertTrue(errors.contains("Au moins un caractère spécial"));
    }

    // --- question 3 : espace ---

    @Test
    void check_withSpace_oneError() {
        List<String> errors = Password.check("Azerty 123!xyz");
        assertEquals(1, errors.size());
        assertTrue(errors.contains("Aucun espace"));
    }

    // le piège : un espace n'est pas un caractère spécial
    @Test
    void check_spaceWithoutSpecial_twoErrors() {
        List<String> errors = Password.check("Azerty 123xyz");
        assertEquals(2, errors.size());
        assertTrue(errors.contains("Au moins un caractère spécial"));
        assertTrue(errors.contains("Aucun espace"));
    }

    // --- question 4 : plusieurs règles à la fois ---

    @Test
    void check_abc_threeErrors() {
        List<String> errors = Password.check("abc");
        assertEquals(3, errors.size());
        assertTrue(errors.contains("Au moins 12 caractères"));
        assertTrue(errors.contains("Au moins un chiffre"));
        assertTrue(errors.contains("Au moins un caractère spécial"));
    }
}
