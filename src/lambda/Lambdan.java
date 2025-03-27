package lambda;

import java.util.Arrays;
import java.util.List;

public class Lambdan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Using Lambda to double each number
        numbers.forEach(n -> System.out.println(n * 2));
    }
}
