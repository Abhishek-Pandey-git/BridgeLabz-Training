package com.multithreading;

public class Main{
    public static void main(String[] args) throws InterruptedException{
        raceCondition rc=new raceCondition();
        
        Thread t1=new Thread(rc,"t1");
         Thread t2=new Thread(rc,"t2");

         Thread t3=new Thread(rc,"t3");   
          Thread t4=new Thread(rc,"t4");
           Thread t5=new Thread(rc,"t5");
           t1.start();t2.start();t3.start();t4.start();t5.start();
           t1.join(); t2.join(); t3.join(); t4.join(); t5.join();
           System.out.println(raceCondition.count);
    }
}
class raceCondition implements Runnable{
    public static int count=0;
    @Override
    public synchronized void run(){
        for(int i=1;i<=1000;i++){
            count++;
        }
    }
}


