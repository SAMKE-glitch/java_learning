package threads;


public class TaskRunner implements Runnable {
	private final int taskId;

	public TaskRunner(int taskId) {
		this.taskId = taskId;
	}
}
