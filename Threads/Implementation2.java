package Threads;

public class Implementation2 {
    public static void main(String[] args) {
        
        MyRunnable run = new MyRunnable() ; 
        Thread t1 = new Thread(run) ; 

        t1.start() ; // starts the thread, calling the run() method

    }
}

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
