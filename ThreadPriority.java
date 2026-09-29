// Worker class that implements Runnable to demonstrate thread execution
class PriorityWorker implements Runnable {
    @Override
    public void run() {
        // Fetch the name and priority of the currently executing thread
        String threadName = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        
        System.out.println(threadName + " started with Priority: " + priority);
        
        // Simulating some work
        for (int i = 0; i < 3; i++) {
            System.out.println(threadName + " is executing loop " + i);
            try {
                Thread.sleep(100); // Pause briefly to let other threads run
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        
        System.out.println(threadName + " has finished execution.");
    }
}

// Main class matching your requested name
public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        // Create a single Runnable instance
        PriorityWorker worker = new PriorityWorker();

        // Create three distinct threads
        Thread threadLow = new Thread(worker, "Low-Priority-Thread");
        Thread threadMedium = new Thread(worker, "Medium-Priority-Thread");
        Thread threadHigh = new Thread(worker, "High-Priority-Thread");

        // Assign priorities using built-in Thread constants
        threadLow.setPriority(Thread.MIN_PRIORITY);   // Priority value: 1
        threadMedium.setPriority(Thread.NORM_PRIORITY); // Priority value: 5 (Default)
        threadHigh.setPriority(Thread.MAX_PRIORITY);   // Priority value: 10

        // Start the threads
        threadLow.start();
        threadMedium.start();
        threadHigh.start();
    }
}
