package Threads;

public class ThreadExecution {
    public static void main(String[] args) {
        
        NumberPrinter obj1 = new NumberPrinter() ; 

        NumberPrinter obj2 = new NumberPrinter() ; 

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2) ; 

        thread1.start();
        thread2.start();

    }
}

class NumberPrinter implements Runnable{

    @Override

    public void run(){
        for(int i=1 ; i <= 5 ; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
        try{
            Thread.sleep(1000); // sleep for 1 second
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}