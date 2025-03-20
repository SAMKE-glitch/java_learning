package generics.wildcards;

import java.util.List;

public class Wildcards {
    // Types of wildcards
    // 1. UPPER BOUNDED WILDCARDS (<? extend T>)
    // Use when a method only needs from a collection
    public void processsList(List<? extends Number> numbers){
        for(Number num : numbers){
            System.out.println(num);
        }
    }
    public static void main(String[] args){
        // Java allows wildcards (?) to make code more flexible when dealing with unknown types

    }
}
