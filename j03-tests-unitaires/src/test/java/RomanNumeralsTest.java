import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    void toRoman_1_givesI() {
        assertEquals("I", RomanNumerals.toRoman(1));
    }
}
