package ejercicio_4_todoitem;

public class Finished extends State {

	protected Finished(ToDoItem task) {
		super(task);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("ERROR: you can't pause (or unpause) in finished state");
		
	}


	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

}
