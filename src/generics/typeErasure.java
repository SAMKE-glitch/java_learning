import java.util.ArrayList;
import java.util.List;

// Java generics only exist at compile-time
// And are removed when the code has compiled.
// The process is called Type Erasure
List<String> list = new ArrayList<>();
list.add("Java");
String value = list.get(0);
System.out.println(value);
