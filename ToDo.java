
import java.util.ArrayList;
/**
 * @author chris
 *
 */
public class ToDo {
	
	
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	
	/**
	 * @param title
	 * @param description
	 * @param price
	 * @param contact
	 * @param supplies
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	
	/**
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	
	
	/**
	 *
	 */
	public String toString() {
		return "***** " + this.title + " *****\n" + this.description + "\n" + "Business Contacts: " + this.contact + "\n"+ supplies + "\n" + "Price: " + this.price ;
	}
	
	

}

