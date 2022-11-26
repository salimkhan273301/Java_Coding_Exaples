package employee.com;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {

		Set<Employee> set=new HashSet<Employee>();
		set.add(new Employee("Salim","CSE",23888));
		set.add(new Employee("Salim","CSE",23888));
		set.add(new Employee("Salim","CSE",23888));
		
		System.out.println(set.toString());
		


	}

}
