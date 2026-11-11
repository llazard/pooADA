import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Partie optionnelle, après Qix : un test par règle métier, trois valeurs chacun.
class FizzBuzzParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 7, 11})
    void fizzBuzz_noRule_returnsNumber(int n) {
        assertEquals(String.valueOf(n), FizzBuzz.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 21})
    void fizzBuzz_oddMultipleOf3_givesFizz(int n) {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 25, 35})
    void fizzBuzz_oddMultipleOf5_givesBuzz(int n) {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45, 75})
    void fizzBuzz_oddMultipleOf15_givesFizzBuzz(int n) {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 8})
    void fizzBuzz_evenWithNoOtherRule_givesQix(int n) {
        assertEquals("Qix", FizzBuzz.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 12, 18})
    void fizzBuzz_multipleOf6_givesFizzQix(int n) {
        assertEquals("FizzQix", FizzBuzz.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 40})
    void fizzBuzz_multipleOf10_givesBuzzQix(int n) {
        assertEquals("BuzzQix", FizzBuzz.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {30, 60, 90})
    void fizzBuzz_multipleOf30_givesFizzBuzzQix(int n) {
        assertEquals("FizzBuzzQix", FizzBuzz.fizzBuzz(n));
    }
}
