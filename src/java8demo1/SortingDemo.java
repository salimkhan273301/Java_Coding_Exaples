package java8demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingDemo {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"Salim",20000.0));
		list.add(new Employee(4,"Nadeem",10000.0));
		list.add(new Employee(74,"Amirullah",30000.0));
		list.add(new Employee(17,"Kalimullah",50000.0));
		list.add(new Employee(16,"Seraj",60000.0));
		list.add(new Employee(11,"Firoz",35000.0));
		list.add(new Employee(12,"Firoz",35000.0));
		list.add(new Employee(132,"Firoz",35000.0));
		list.stream().forEach(x->{
			System.out.println(x.toString());
			
		});
		System.out.println("==============================================");
		Collections.sort(list);
		for(Employee e:list) {
			System.out.println(e);
		}
		
		System.out.println("==============================================");
		// sum of salary using Java 8..............
		
		Double sumofsalary=list.stream()
				.mapToDouble(x->x.getSalary())
				.sum();
		
		System.out.println("Sum Of salary = "+sumofsalary);
		
		
		System.out.println("==========================================================");
		
		Double avgofSalary=list.stream()
				.collect(Collectors.averagingDouble(y->y.getSalary()));
		System.out.println("Salary Average = "+ avgofSalary);
		
		
		System.out.println("===============================================================");
		
		Long noOfRecord= list.stream()
				.count();
		System.out.println("No Of Record whose id > 10: "+noOfRecord);
		
		System.out.println("================================================================");
		Map<String, Long> map=list.stream().map(x->x.getName())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

//  print the data;
	map.forEach((x,y)->{
		System.out.println(x+"->"+y);
	});

	}

}
