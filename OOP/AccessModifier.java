public class AccessModifier {
    public static void main(String[] args) {
        
        Employee emp = new Employee();

        emp.setName("Sonu NM") ; 
        System.out.println(emp.getName());

        emp.setId(1);
        System.out.println(emp.getId());

    }
}

class Employee{
    private int id ; 
    private String name ; 

    public void setName(String n){
        name = n ; 
    }
    public String getName(){
        return name ; 
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id ; 
    }
}
