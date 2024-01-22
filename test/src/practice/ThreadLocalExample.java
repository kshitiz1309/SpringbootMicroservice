package practice;

public class ThreadLocalExample {
    private static final ThreadLocal<Integer> threadLocalVar = new ThreadLocal<>();
    public static void main(String[] args) {
        // Set thread-local variable for the main thread
        threadLocalVar.set(42);
        // Create a new thread
        Thread otherThread = new Thread(() -> {
            // Access the thread-local variable in the new thread
            System.out.println("Other Thread: " + threadLocalVar.get()); // Will print null
            threadLocalVar.set(100); // Set a different value for this thread
            System.out.println("Other Thread Modified: " + threadLocalVar.get()); // Will print 100
        });
        otherThread.start();
        System.out.println("practice.Main Thread: " + threadLocalVar.get()); // Will print 42
    }
}

