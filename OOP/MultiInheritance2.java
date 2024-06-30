
/* 

Multiple inheritance can lead to a scenario known as the diamond problem. This occurs when a class inherits from two classes that both inherit from a single common superclass. If the common superclass has a method and both intermediate classes override this method, the subclass would face ambiguity about which method to inherit. 

*/

public class MultiInheritance2 {
    
}

class A{
    void show(){
        System.out.println("Class A");
    }
}

class B extends A{
    void show(){
        System.out.println("Class B");
    }
}

class C extends A{
    void show(){
        System.out.println("Class C");
    }
}

// class D cannot inherit from both B and C

class D extends B, C{
    // compilation error: multiple inheritance is not allowed
}