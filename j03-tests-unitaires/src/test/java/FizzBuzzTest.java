import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void fizzBuzz_1_returnsNumber() {
        // GIVEN
        int number = 1;
        // WHEN
        String result = FizzBuzz.fizzBuzz(number);
        // THEN
        assertEquals("1", result);
    }
}
