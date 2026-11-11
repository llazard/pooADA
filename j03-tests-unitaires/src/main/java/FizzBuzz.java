public class FizzBuzz {

    // Après la règle Qix : les mots se concatènent, dans l'ordre Fizz, Buzz, Qix.
    public static String fizzBuzz(int n) {
        String result = "";
        if (n % 3 == 0) {
            result += "Fizz";
        }
        if (n % 5 == 0) {
            result += "Buzz";
        }
        if (n % 2 == 0) {
            result += "Qix";
        }
        if (result.isEmpty()) {
            return String.valueOf(n);
        }
        return result;
    }
}
