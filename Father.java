package family;

import java.util.ArrayList;
import java.util.List;

public class Father {
	private String name;
	private String lastName;
	private static double budget = 5000;
	private List<Product>list = new ArrayList<>();
	private Requirement requirement;
	
	
	
	public Father() {
	
	}



	public Father(String name, String lastName, List<Product> list, Requirement requirement) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.list = list;
		this.requirement = requirement;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public static double getBudget() {
		return budget;
	}



	public static void setBudget(double budget) {
		Father.budget -= budget;
	}



	public List<Product> getList() {
		return list;
	}



	public void setList(List<Product> list) {
		this.list = list;
	}



	public Requirement getRequirement() {
		return requirement;
	}



	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}



	@Override
	public String toString() {
		return "Father [name=" + name + ", lastName=" + lastName + ", list=" + list + ", requirement=" + requirement
				+ "]";
	}



	public void buyProduct(double price) {
		
	}
	
	
	

}
