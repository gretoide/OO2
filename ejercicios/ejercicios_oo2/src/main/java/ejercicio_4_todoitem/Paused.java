package ejercicio_4_todoitem;

import java.time.LocalDateTime;

public class Paused extends State {

	protected Paused(ToDoItem task) {
		super(task);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void togglePause() {
		this.getTask().setState(new inProgress(this.getTask()));

	}

	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask()));
		this.getTask().setEnd(LocalDateTime.now());
	}

}
