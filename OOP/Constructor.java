public class Constructor {
    public static void main(String[] args) {
    
        Employee emp1 = new Employee() ; 

        System.out.println(emp1.getName());
        System.out.println(emp1.getId());

    }
}

class Employee{
    private int id ; 
    private String name ; 

    public void setName(String name){
        this.name = name ; 
    }
    public String getName(){
        return name ; 
    }

    public void setId(int id){
        this.id = id ; 
    }
    public int getId(){
        return id ; 
    }

    // Constructor 

    public Employee(){
        id = 1 ; 
        name = "Sonu NM" ; 
    }

}
