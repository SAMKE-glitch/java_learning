package threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting tasks using virtual threads...");

        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            Thread.startVirtualThread(new TaskRunner(taskId));
        }

        try {
            Thread.sleep(2000); // Let threads complete before program exits
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks dispatched.");
    }
}

