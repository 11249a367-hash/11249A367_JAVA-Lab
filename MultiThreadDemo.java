
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
