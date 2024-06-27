
#### String Concepts 


- StringBuilder vs String vs StringBuffer

- toString()

- compareTo()

- Why is the character array preferred over string for storing confidential information?

- Why String and StringBuffer are said to be thread-safe (synchronized), while StringBuilder are not thread-safe (not synchronized)? 

StringBuffer

Thread Safety: StringBuffer is synchronized, meaning it is thread-safe. Multiple threads can safely access and modify a StringBuffer object without causing data corruption.

Introduced: StringBuffer was introduced in early versions of Java to provide a mutable alternative to String, allowing modifications without creating new objects.

Performance: Because of its synchronization mechanism, StringBuffer can be slower in single-threaded contexts due to the overhead of managing thread safety.

StringBuilder

Thread Safety: StringBuilder is not synchronized, meaning it is not thread-safe. It should be used in scenarios where thread safety is not a concern, such as single-threaded applications.

Introduced: StringBuilder was introduced in Java 5 (JDK 1.5) to provide a more efficient alternative to StringBuffer when thread safety is not required.

Performance: StringBuilder is generally faster than StringBuffer in single-threaded scenarios because it does not have the overhead of synchronization.

Why StringBuilder Was Introduced

Performance Improvement: In many applications, string manipulation is done in a single-threaded context where synchronization is unnecessary. The synchronization overhead in StringBuffer can lead to performance issues. StringBuilder provides a more efficient option by removing this overhead.

- Thread safety and Synchronization. How are they related

- String < StringBuffer < StringBuilder (Performance)


#### Miscellaneous


- Difference between == and equals()

- why can't we use length() property with primitive data types like int

    For eg: int num = 123 ; 
            int length = num.length() ; 

We can convert the integer to a 'String' and then use the 'length()' method. 

    int num = 123;
    String numStr = Integer.toString(num) ; 
    int length = numStr.length() ; 

- Constructor Overloading

- this and Super keyword

- Copy Constructor 

- local, instance and static variables

- static method, static variable and static class 

- JDK, JRE, JVM 

- throw throws

- Thread

- Constructor Vs. Method , why constructor can't be marked final 

- pass by value Vs. pass by reference


#### Collections 


- Array Vs. Collections 

- ArrayList, HashMap, HashSet

- Collection Vs Collections

- HashSet and TreeSet

- Cursors (Iterator, ListIterator, Enumeration)

