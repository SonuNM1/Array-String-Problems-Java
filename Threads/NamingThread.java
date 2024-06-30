package Threads;

public class NamingThread {
    public static void main(String[] args) {
        
        Thread t1 = new Thread();
        System.out.println("Thread 1: " + t1.getName());

        Thread t2 = new Thread() ; 
        System.out.println("Thread 2: " + t2.getName());

        t1.start();
        t2.start(); 

        t1.setName("Sonu NM");
        t1.setName("Garima");

        System.out.println("New thread name t1: " +t1.getName() );

    }
}

class LearningThread extends Thread{

}
