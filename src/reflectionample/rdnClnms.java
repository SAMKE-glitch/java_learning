int[] numbers = {1, 2, 3};
Class<?> clazz = numbers.getClass();
System.out.println("Simple: " + clazz.getSimpleName()); // "int[]"
System.out.println("Type: " + clazz.getTypeName()); // "int[]"
System.out.println("Canonical: " + clazz.getCanonicalName()); // "int[]"
System.out.println("JVM Name: " + clazz.getName());