package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Teacher implements Comparable<Teacher>{
	int id;
	String name;
	double salary;
	public Teacher(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
// this is first technic.....	
	
//	@Override
//	public int compareTo(Teacher o) {
//		
//		return this.id-o.id;
//	}
	
// this is 2nd technic....	
	
//	@Override
//	public int compareTo(Teacher o) {
//		
//		if(this.id==o.id)
//			return 0;
//		else if(this.id>o.id)
//			return 1;
//		else
//			return -1;
//	}
	
	// this is 3rd technic......
	
	@Override
	public int compareTo(Teacher o) {
		
		//return this.id>o.id?-1:this.id<o.id?1:0; // decending order...
		return  this.salary>o.salary?1:this.salary<o.salary?-1:0;
	}
	
	
}

public class SumOfStudentsAge{

	public static void main(String[] args) {
		List<Teacher> list=new ArrayList<Teacher>();
		list.add(new Teacher(11,"salim",2700.69));
		list.add(new Teacher(2,"Hasan",2900.99));
		list.add(new Teacher(13,"Naem",2700.09));
		list.add(new Teacher(4,"Sadab",2800.89));
		list.add(new Teacher(10,"salim",27000.59));
		list.add(new Teacher(12,"salim",2700.39));
		list.add(new Teacher(17,"Nasir",2500.99));
	
		for(Teacher s:list)
		{
			System.out.println(s);
		}
		
		System.out.println("============================================================");
		Collections.sort(list);
		for(Teacher s:list)
		{
			System.out.println(s);
		}
		
		Double salaryAvg=list.stream().collect(Collectors.averagingDouble(x->x.salary));
		System.out.println(salaryAvg);
		Double sumSalary=list.stream().mapToDouble(x->x.salary).sum();
		
		System.out.println(sumSalary);
	}
 

}
