package Concepts;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            checkFile("test.txt");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }

    public static void checkFile(String name) throws FileNotFoundException{

        File file = new File(fileName) ; 

        if(!file.exists()){
            throw new FileNotFoundException("file not found: " + fileName) ; 
        }else{
            System.out.println("File exists");
        }

    }
}
