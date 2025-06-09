package threads;


public class TaskRunner implements Runnable {
	private final int taskId;

	public TaskRunner(int taskId) {
		this.taskId = taskId;
	}


	public void run() {
		System.out.println("Task " + taskId + " started on " + Thread.currentThread());
		try {
			// Simulate work
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Task " + taskId + " completed on " + Thread.currentThread());
	}
}
