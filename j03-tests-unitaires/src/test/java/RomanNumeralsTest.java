import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Une colonne du tableau de la fiche = un test. En commentaire : ce que renvoie le code fourni.
class RomanNumeralsTest {

    @Test
    void toRoman_1_givesI() {
        assertEquals("I", RomanNumerals.toRoman(1));
    }

    // ajouté ensemble à la question 0
    @Test
    void toRoman_2_givesII() {
        assertEquals("II", RomanNumerals.toRoman(2));
    }

    @Test
    void toRoman_3_givesIII() {
        assertEquals("III", RomanNumerals.toRoman(3));
    }

    @Test
    void toRoman_4_givesIV() {
        assertEquals("IV", RomanNumerals.toRoman(4)); // fourni : IIII (erreur 1)
    }

    @Test
    void toRoman_9_givesIX() {
        assertEquals("IX", RomanNumerals.toRoman(9));
    }

    @Test
    void toRoman_14_givesXIV() {
        assertEquals("XIV", RomanNumerals.toRoman(14)); // fourni : XIIII (erreur 1)
    }

    @Test
    void toRoman_40_givesXL() {
        assertEquals("XL", RomanNumerals.toRoman(40));
    }

    @Test
    void toRoman_90_givesXC() {
        assertEquals("XC", RomanNumerals.toRoman(90)); // fourni : LXL (erreur 2)
    }

    @Test
    void toRoman_400_givesCD() {
        assertEquals("CD", RomanNumerals.toRoman(400)); // fourni : DC (erreur 3)
    }

    @Test
    void toRoman_1994_givesMCMXCIV() {
        assertEquals("MCMXCIV", RomanNumerals.toRoman(1994)); // fourni : MCMLXLIIII (erreurs 1 et 2)
    }

    @Test
    void toRoman_2024_givesMMXXIV() {
        assertEquals("MMXXIV", RomanNumerals.toRoman(2024)); // fourni : MMXXIIII (erreur 1)
    }
}
