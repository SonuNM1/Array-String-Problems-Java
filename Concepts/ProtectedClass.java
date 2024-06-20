package Concepts;

public class ProtectedClass {
    public static void main(String[] args) {
        
        Child obj = new Child() ; 
        obj.accessProtectedMembers();

    }
}

class Parent{
    protected int protectedVariable = 20 ; 

    protected void protectedMethod(){
        System.out.println("Protected Method");
    }
}

class Child extends Parent{
    public void accessProtectedMembers(){
        System.out.println(protectedVariable); // accessible

        protectedMethod(); // accessible
    }
}
