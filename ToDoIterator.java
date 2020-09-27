
import java.util.Iterator;
/**
 * @author chris
 *
 */

public class ToDoIterator implements Iterator {
	
	private ToDo[] todos;
	private int position = 0;
	
	
	/**
	 *
	 */
	public ToDo next() {
		ToDo todo = todos[position];
		position = position + 1;
		return todo;
	}
	/**
	 * @param todos
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	
	
	/**
	 *
	 */
	public boolean hasNext() {
	
		if(position >= todos.length || todos[position] == null) {
			return false;
		}
		else {
			return true;
		}
	}
	

}

