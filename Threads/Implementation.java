package Threads;

public class Implementation {
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread();
        t1.start() ; // starts the thread, calling the run() method

    }
}

class MyThread extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
}
