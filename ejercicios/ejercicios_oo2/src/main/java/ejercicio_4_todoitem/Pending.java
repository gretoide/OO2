package ejercicio_4_todoitem;

import java.time.LocalDateTime;

public class Pending extends State {

	public Pending(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
		this.getTask().setState(new inProgress(this.getTask()));
		this.getTask().setStart(LocalDateTime.now());
		
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("ERROR: you can't pause (or unpause) in pending state");
		
	}

	@Override
	public void finish() {
		throw new RuntimeException("ERROR: the task never started");
	}

}
