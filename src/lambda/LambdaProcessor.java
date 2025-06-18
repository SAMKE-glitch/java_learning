package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


/*
 * LambdaProcessor demonstrates functional programming using Java lambdas.
 * It transforms a list of integers by applying a given lambda expression.
 */
public class LambdaProcessor {
     
    private final List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    /*
     * Applies a transformation to each number in the list and prints the result.
     *
     * @param transformer a lambda expression to transform the integer
     */
    public void process(Function<Integer, Integer> transformer) {
    	numbers.forEach(n -> System.out.println(transformer.apply(n)));
    }

    /*
     * Application Entry point
     */

    public static void main(String[] args){
        LambdaProcessor processor = new LambdaProcessor();
        
        System.out.println("Doubled values:");
	processor.process(n -> n*2);

	System.out.println("Squared values:");
	processor.process(n -> n * n);

	System.out.println("Incremented values");
	processor.process(n -> n+1);


    }
}
