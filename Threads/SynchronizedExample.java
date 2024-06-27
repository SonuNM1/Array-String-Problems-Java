
package Threads ; 

public class SynchronizedExample{
    public static void main(String[] args) {
        
        // Create a counter object 

        Counter counter = new Counter() ; 

        // Create increment tasks 

        Runnable task1 = new IncrementTask(counter) ; 
        Runnable task2 = new IncrementTask(counter) ; 
        Runnable task3 = new IncrementTask(counter) ; 

        // Create threads for each task 

        Thread thread1 = new Thread(task1, "Thread 1") ; 
        Thread thread2 = new Thread(task1, "Thread 2") ; 
        Thread thread3 = new Thread(task1, "Thread 3") ; 

        // Start the threads 

        thread1.start(); // start executing task1
        thread2.start(); // start executing task3
        thread3.start(); // start executing task3

        // wait for all threads to finish 

        thread1.join(); // wait for thread1 to complete
        thread2.join(); // wait for thread1 to complete
        thread3.join(); // wait for thread1 to complete

        // print the final count 

        System.out.println("Final count: " + counter.getCount());

    }
}

class Counter{
    private int count = 0 ; // Private variable to store the count
    
    // Synchronized method to ensure thread-safe increment 

    public synchronized void increment(){
        count++ ; // increment the count by 1 

        System.out.println(Thread.currentThread().getName() + " increment count to: " + count);
    }

    // Synchronized method to get the current count 

    public synchronized int getCount(){
        return count ; // return the current count 
    }
}

class IncrementTask implements Runnable{
    private Counter counter ; // reference to the Counter object 

    //  Constructor to initialize the Counter object 

    public IncrementTask(Counter counter){
        this.counter = counter ; 
    }

    @Override 

    public void run(){

        // each thread will increment the counter 

        counter.increment(); // call the synchronized increment method

    }

}