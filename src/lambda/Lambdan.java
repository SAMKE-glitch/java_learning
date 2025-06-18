package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lambdan {
    /**
     * LambdaProcessor demonstrates functional programming using Java lambdas.
     * It trasnformms a list of integers by applying a given lambda experession
     *
     */	
    
    public static void main(String[] args) {
     i                *
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Using Lambda to double each number
        numbers.forEach(n -> System.out.println(n * 2));
    }
}
