### String Concepts

- Why are String immutable ?

Strings are often used to hold sensitive data such as database URLs, usernames, passwords, and file paths. If strings were mutable, an attacker could change the content of these strings and potentially compromise the application.

Prevents unauthorized modifications to strings holding sensitive data.

Immutable objects are automatically thread-safe (synchronized)

- == Vs. equals()

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

### OOP (Object Oriented Programming)

- Polymorphism Example: Think of a remote control that can work with different devices like a TV, a DVD player, and a music system. Even though the remote control looks the same and you press the same buttons, it does different things depending on what device it's controlling.

- Why is Java called compiled as well as interpreted language? 

- Can we overload Constructors ?

- Why we cannot override the static method? 

- Composition (has-a) Vs. Inheritance (is-a)

- calling the parametrized constructor from superclass using the super() keyword

- How do constructors work in Java inheritance, and why is the superclass constructor called before the subclass constructor when creating an object of the subclass? 

- Java does not support multiple inheritance of classes but allows a class to implement multiple interfaces. Why? 

- Types of inheritance (Single, Multilevel, Hierarchical, Multiple inheritance through interface)

- Why abstract class cannot be instantiated ?

- extend Vs. implements keyword

- abstract class Vs. interfaces: Since, Java 8, interfaces can have default methods with a body.

- super keyword

- Can you prevent a class from being inherited? How?

- Inheritance (is-a) Vs. Composition (has-a)

- Dynamic method dispatch

### Miscellaneous

- pass by value Vs. pass by reference

- Compile-time and Run-time Error

- protected access modifier

- Difference between == and equals()

- why can't we use length() property with primitive data types like int

  For eg: int num = 123 ;
  int length = num.length() ;

We can convert the integer to a 'String' and then use the 'length()' method.

    int num = 123;
    String numStr = Integer.toString(num) ;
    int length = numStr.length() ;

The primitive data types are not objects; they are simple values stored directly in memory.

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

### Collections

- Array Vs. Collections

- ArrayList, HashMap, HashSet

- Collection Vs Collections

- HashSet and TreeSet

- Cursors (Iterator, ListIterator, Enumeration)

### Threads & Synchronization

- A thread in Java is a lightweight process that allows concurrent execution of tasks. Java provides built-in support for multithreading, enabling programs to perform multiple operations simultaneously. Each thread runs independently and can perform different tasks concurrently within the same program.

- Multi-threading, Synchronization, Race condition, critical section..how they are related

- Creating Threads

- Synchronization 

- Why Synchronization needed?

In a multi-threaded environment, multiple threads may attempt to modify the same shared resource concurrently, leading to data corruption and unpredictable results. Synchronization helps to avoid such problems by ensuring that only one thread can access the critical section at a time.

- Relationship between threads and Synchronization

1.  Concurrency: Threads enable concurrent execution, allowing multiple tasks to run simultaneously. However, concurrency introduces the risk of data inconsistency when multiple threads access shared resources simultaneously.

2.  Mutual Exclusion: Synchronization provides mutual exclusion, ensuring that only one thread can access the critical section at a time. This prevents data corruption and ensures thread-safety.

- Synchronized keyword: used to control access to a block of code by multiple threads. It ensures only one thread can execute a synchronized block/method at a time, thus preventing data inconsistency and race conditions. This is crucial in multi-threaded environment where multiple threads might access shared resources concurrently.

- Thread.currentThread() : returns a reference to the currently executing thread object. used to get information about the thread that is currently executing, such as its name, priority



### Error & Exceptions


- Checked and Unchecked exceptions

- Nested try-catch

- Custom Exception

- finalize

- throw vs throws

- Anonymous class 

- Lambda expression and functional interface 

- member inner class, static nested class, local inner class, anonymous inner class 