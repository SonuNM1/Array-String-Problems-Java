package Concepts; 

public class ThreadClass{
    public static void main(String[] args) {
       
        MyThread thread = new MyThread() ; 
        thread.start() ; // start the thread 

    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}