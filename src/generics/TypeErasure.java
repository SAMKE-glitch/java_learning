import java.util.ArrayList;
import java.util.List;

// Java generics only exist at compile-time
// And are removed when the code has compiled.
// The process is called Type Erasure
// Type Erasure exist because of 1:
// Backward compatibility- Java maintains compatibility with older non-generic code
// 2. Performance- No runtime overhead for generic types
public class TypeErasure {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Java");
        String value = list.get(0);
        System.out.println(value);

    }
}

