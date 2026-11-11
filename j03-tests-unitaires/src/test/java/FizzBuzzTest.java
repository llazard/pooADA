import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Après Qix. En commentaire, la valeur attendue de la partie A quand elle change.
class FizzBuzzTest {

    @Test
    void fizzBuzz_1_returnsNumber() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    void fizzBuzz_2_qix() {
        assertEquals("Qix", FizzBuzz.fizzBuzz(2)); // partie A : "2"
    }

    @Test
    void fizzBuzz_3_fizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void fizzBuzz_4_qix() {
        assertEquals("Qix", FizzBuzz.fizzBuzz(4)); // partie A : "4"
    }

    @Test
    void fizzBuzz_5_buzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void fizzBuzz_6_fizzQix() {
        assertEquals("FizzQix", FizzBuzz.fizzBuzz(6)); // partie A : "Fizz"
    }

    @Test
    void fizzBuzz_7_returnsNumber() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    void fizzBuzz_8_qix() {
        assertEquals("Qix", FizzBuzz.fizzBuzz(8)); // partie A : "8"
    }

    @Test
    void fizzBuzz_9_fizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    void fizzBuzz_10_buzzQix() {
        assertEquals("BuzzQix", FizzBuzz.fizzBuzz(10)); // partie A : "Buzz"
    }

    @Test
    void fizzBuzz_11_returnsNumber() {
        assertEquals("11", FizzBuzz.fizzBuzz(11));
    }

    @Test
    void fizzBuzz_12_fizzQix() {
        assertEquals("FizzQix", FizzBuzz.fizzBuzz(12)); // partie A : "Fizz"
    }

    @Test
    void fizzBuzz_13_returnsNumber() {
        assertEquals("13", FizzBuzz.fizzBuzz(13));
    }

    @Test
    void fizzBuzz_15_fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void fizzBuzz_30_fizzBuzzQix() {
        assertEquals("FizzBuzzQix", FizzBuzz.fizzBuzz(30)); // partie A : "FizzBuzz"
    }

    @Test
    void fizzBuzz_45_fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
    }
}
