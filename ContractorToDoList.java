
import java.util.ArrayList;

/**
 * @author chris
 *
 */
public class ContractorToDoList {

	private int MAX_TODOS = 2;
	private String Address;
	private ToDo[] todos;
	private int count = 0;
	public double TotalC = 0.0;

	/**
	 * @param Address
	 */
	public ContractorToDoList(String Address) {
		todos = new ToDo[MAX_TODOS];
		this.Address = Address;

	}

	/**
	 * @param title
	 * @param description
	 * @param price
	 * @param contact
	 * @param supplies
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo todo = new ToDo(title, description, price, contact, supplies);
		if (count >= MAX_TODOS) {
			todos = growArray(todos);
		}
		todos[count] = todo;
		count = count + 1;

	}

	/**
	 * @return
	 */
	public String getAddress() {
		return this.Address;
	}

	/**
	 * @return
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
	}

	/**
	 * @return
	 */
	public double getTotalCost() {
		double tC = 0.0;
		for (int i = 0; i < todos.length; i++) {
			if (todos[i] != null) {
				tC += todos[i].getPrice();
			}
		}
		return tC;
	}

	/**
	 * @param todos
	 * @return
	 */
	private ToDo[] growArray(ToDo[] todos) {
		ToDo[] temp;
		temp = new ToDo[2 * todos.length];
		for (int i = 0; i < todos.length; i++) {
			temp[i] = todos[i];
		}
		todos = temp;
		return todos;

	}
}
