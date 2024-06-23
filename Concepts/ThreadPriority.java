package Concepts ; 

public class ThreadPriority{
    public static void main(String args[]){

    // Create three threads with different names 

    Thread thread1 = new Thread(new MyRunnable(), "Thread-1") ; 
    Thread thread2 = new Thread(new MyRunnable(), "Thread-2") ; 
    Thread thread3 = new Thread(new MyRunnable(), "Thread-3") ; 
    
    // set the priorities for each thread 

    thread1.setPriority(Thread.MIN_PRIORITY) ; 
    thread1.setPriority(Thread.NORM_PRIORITY) ; 
    thread1.setPriority(Thread.MAX_PRIORITY) ; 

    // Start the threads 

    thread1.start() ; 
    thread2.start() ; 
    thread3.start() ; 


    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        // print the current thread name and its priority 

        System.out.println(Thread.currentThread().getName() + " with priority" + Thread.currentThread().getPriority() + " is running.");
    }
}