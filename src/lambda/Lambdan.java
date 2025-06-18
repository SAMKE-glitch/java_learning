package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaProcessor {
    /**
     * LambdaProcessor demonstrates functional programming using Java lambdas.
     * It trasnformms a list of integers by applying a given lambda experession
     *
     */	
    private final List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    public void process(Funtion<Integer, Integer> transformer) {
    	numbers.forEach(n -> System.out.println(transformer.apply(n)));
    }

    public static void main(String[] args)
        LamdaProcessor processor = new LambdaProcessor();
        
        System.out.println("Doubled values:");
	processor.process(n -> n*2);

	System.out.println("Squared values:");
	processor.process(n -> n * n);

	System.out.println("Incremented values");
	processor.process(n -> n+1)


    }
}
