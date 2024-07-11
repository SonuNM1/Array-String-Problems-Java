
import java.util.Random ; 

public class RandomNumber {
    public static void main(String[] args) {
        
        Random random = new Random() ; 

        // generate a random integer 

        int randomInt = random.nextInt() ; // any integer value 
        System.out.println("Random integer: " + randomInt);

        // generate a random integer within a range (0 to 99)

        int randomIntInRange = random.nextInt(100) ; // 0 to 99 
        System.out.println("Random integer in range 0 to 99: " + randomIntInRange);

        // Generate a random double 

        double randomDouble = random.nextDouble() ; // 0.0 to 1.0
        System.out.println("Random double: " + randomDouble);

        // Generate a random boolean 

        boolean randomBoolean = random.nextBoolean() ; 
        System.out.println("Random boolean: " + randomBoolean);

    }
}
