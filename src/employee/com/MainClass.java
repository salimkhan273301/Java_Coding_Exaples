package employee.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee("Salim","CSE",2700.00));
		list.add(new Employee("Aneel","CSE",2800.00));
		list.add(new Employee("Suneel","EC",2900.00));
		list.add(new Employee("Seraj","CSE",3000.00));
		list.add(new Employee("Akash","MC",1700.00));
		list.add(new Employee("Ankit","CSE",3700.00));
		list.add(new Employee("Sameer","MC",4700.00));
		list.add(new Employee("Jasandeep","EC",7700.00));
		list.add(new Employee("Aneel kumar","CSE",9700.00));
		list.add(new Employee("Sajid","CSE",2700.00));
		
	// Actual List .....	
		System.out.println(list.toString());
		
		Long totalRecord=list.stream().count();
		System.out.println("Total Records in the List :"+ totalRecord);
		Long salary_sum=(long) list.stream().mapToDouble(x->x.getSalary()).sum();
		System.out.println("Total Salary of Employee: "+salary_sum);
		
		
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(Employee e:list) {
			if(map.containsKey(e.getDpt()))
				map.put(e.getDpt(), map.get(e.getDpt())+1);
			else {
				map.put(e.getDpt(), 1);
			}			
		}
		map.forEach((k,v)->{
			System.out.println(k+"-"+v);
		});
		
		// get max Salary...
		Map<String, Long> emplist=list.stream().collect(Collectors.groupingBy(Employee::getDpt,Collectors.counting()));
		
		System.out.println(emplist);
		
		
	}

}
