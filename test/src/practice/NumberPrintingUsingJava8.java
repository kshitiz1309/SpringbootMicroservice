package practice;

public class NumberPrintingUsingJava8 {
    private static final Object lock = new Object();
    private static int count = 1;
    private static final int MAX_COUNT = 10;
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            synchronized (lock){
                while(count<=MAX_COUNT){
                    if(count%2!=0){
                        System.out.println("OddNumber : "+count);
                        count++;
                        lock.notify();
                    }else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (lock){
                while(count<=MAX_COUNT){
                    if(count%2==0){
                        System.out.println("EvenNumber : "+count);
                        count++;
                        lock.notify();
                    }else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
