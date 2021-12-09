package family;

import java.util.ArrayList;
import java.util.List;

public class Requirement {
	List <Product>list = new ArrayList<>();

	public Requirement() {
		
	}

	public Requirement(List<Product> list) {
		super();
		this.list = list;
	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Requirement [list=" + list + "]";
	}
	
	

}
