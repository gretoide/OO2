package ejercicio_4_todoitem;

import java.time.LocalDateTime;

public class inProgress extends State {

	public inProgress(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void togglePause() {
		this.getTask().setState(new Paused(this.getTask()));

	}

	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask()));
		this.getTask().setEnd(LocalDateTime.now());
	}

}
