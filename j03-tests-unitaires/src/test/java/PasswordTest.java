import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordTest {

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
}
