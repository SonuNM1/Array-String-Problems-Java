
package Threads; 

public class CreatingThread{
    public static void main(String[] args) {
      
        MyThread obj = new MyThread() ; 
        Thread thread = new Thread(obj) ; 

        thread.start();

    }
}

class MyThread implements Runnable{
    public void run(){
        System.out.println("I am thread 1");
    }
}

class MyThread2 implements Runnable{
    public void run(){
        System.out.println("I am thread 2");
    }
}