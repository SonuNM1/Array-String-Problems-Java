
/* 

Java allows a class to implement multiple interfaces to provide a way to achieve multiple inheritance without the associated problems. 

Interfaces only declare method signatures without providing any implementation. This means there is no confict between method implementations as interfaces do not provide behaviour. 

*/

public class MultipleInheritanceInterface {
    
}

interface Printable{
    void print() ; 
}

interface Showable{
    void show() ; 
}

class Document implements Printable, Showable{
    public void print(){
        System.out.println("Printing document");
    }

    public void show(){
        System.out.println("Showing document");
    }
}