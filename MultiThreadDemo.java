AIM:
To demonstrate execution of multiple threads concurrently in Java.

ALGORITHM:
1. Create two classes extending Thread.
2. Override run() in each class with a different task.
3. Create objects for both threads.
4. Start both threads using start().
5. Observe that the outputs may be interleaved because the threads execute concurrently.

CODE:
class CookingTask implements Runnable {
    private final String foodItem;
    private final int preparationTimeMs;

    public CookingTask(String foodItem, int preparationTimeMs) {
        this.foodItem = foodItem;
        this.preparationTimeMs = preparationTimeMs;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started preparing: " + foodItem);
        
        try {
           
            for (int step = 1; step <= 3; step++) {
                Thread.sleep(preparationTimeMs); 
                System.out.println(Thread.currentThread().getName() + " is working on step " + step + " for " + foodItem);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
            return; 
        }
        System.out.println(" SUCCESS: " + foodItem + " is ready! (" + Thread.currentThread().getName() + " finished)");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main Kitchen Thread: Starting the day...");

        
        Runnable task1 = new CookingTask("Chopping Vegetables", 500); 
        Runnable task2 = new CookingTask("Baking the Pizza", 800);      
       
        Thread chef1 = new Thread(task1, "Chef-Alpha");
        Thread chef2 = new Thread(task2, "Chef-Beta");

        
        chef1.start();
        chef2.start();

        try {
           
            chef1.join();
            chef2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main Kitchen Thread: All tasks done. Kitchen closed!");
    }
}

OUTPUT:
Main Kitchen Thread: Starting the day...
Chef-Alpha started preparing: Chopping Vegetables
Chef-Beta started preparing: Baking the Pizza
Chef-Alpha is working on step 1 for Chopping Vegetables
Chef-Beta is working on step 1 for Baking the Pizza
Chef-Alpha is working on step 2 for Chopping Vegetables
Chef-Alpha is working on step 3 for Chopping Vegetables
 SUCCESS: Chopping Vegetables is ready! (Chef-Alpha finished)
Chef-Beta is working on step 2 for Baking the Pizza
Chef-Beta is working on step 3 for Baking the Pizza
 SUCCESS: Baking the Pizza is ready! (Chef-Beta finished)
Main Kitchen Thread: All tasks done. Kitchen closed!

RESULT:
Multiple threads are successfully created and executed concurrently.
