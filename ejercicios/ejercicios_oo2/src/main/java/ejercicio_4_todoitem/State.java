package ejercicio_4_todoitem;
import java.time.Duration;

public abstract class State {
	private ToDoItem task;
	
	protected State(ToDoItem task) {
		this.task = task;
	}

	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();
	
	public Duration workedTime() {
		return Duration.between(this.task.getStart(),this.task.getEnd());
	}
	
	public void addComment(String comment) {
		this.task.getComentarios().add(comment);
	}

	protected ToDoItem getTask() {
		return task;
	}

	protected void setTask(ToDoItem task) {
		this.task = task;
	};
	
	
}
