import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Ce que la démo écrit en direct : un cas nominal par calcul, puis les cas à la marge.
class CalculatorTest {

    // --- un cas nominal par calcul ---

    @Test
    void add_twoPositives() {
        // GIVEN
        int a = 6;
        int b = 3;
        // WHEN
        int result = Calculator.add(a, b);
        // THEN
        assertEquals(9, result);
    }

    @Test
    void subtract_twoPositives() {
        assertEquals(3, Calculator.subtract(6, 3));
    }

    @Test
    void multiply_twoPositives() {
        assertEquals(18, Calculator.multiply(6, 3));
    }

    @Test
    void divide_exact() {
        assertEquals(2.0, Calculator.divide(6, 3), 0.0001);
    }

    // --- les cas à la marge ---

    // attention aux int : sans le (double), 5 / 2 vaudrait 2
    @Test
    void divide_5by2_gives2point5() {
        assertEquals(2.5, Calculator.divide(5, 2), 0.0001);
    }

    // la précision : 1 / 3 ne tombe jamais juste, d'où la tolérance
    @Test
    void divide_1by3_withTolerance() {
        assertEquals(0.3333, Calculator.divide(1, 3), 0.0001);
    }

    // la division par zéro n'existe pas : sur un double, Java renvoie l'infini
    @Test
    void divide_1by0_givesInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(1, 0));
    }
}
