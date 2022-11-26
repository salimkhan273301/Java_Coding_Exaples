package java8examquestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {


List<Employee> employeeList = new ArrayList<Employee>();
         
employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));



//1-Q How Many male and female Employee are in the Organization....
Map<String,Long> listofmalefemale=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
System.out.println(listofmalefemale);
System.out.println("===========================================");







// Query 3.2 : Print the name of all departments in the organization?
List<String> dpt=employeeList.stream().map(Employee::getDepartment).distinct().toList();
System.out.println(dpt.toString());
System.out.println("No of Dept in Organization :"+dpt.size());
employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);


    //Query 3.3 : What is the average age of male and female employees?\

Map<String, Double> avg_age=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));

System.out.println(avg_age);
System.out.println("===========================================");


// Query 3.4 : Get the details of highest paid employee in the organization?

Optional<Employee> opt=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
System.out.println(opt);
System.out.println("===========================================================");
Employee e=opt.get();
System.out.println(e);

System.out.println("===========================================================");
System.out.println("ID : "+e.getId());

System.out.println("Name : "+e.getName());
         
System.out.println("Age : "+e.getAge());
         
System.out.println("Gender : "+e.getGender());
         
System.out.println("Department : "+e.getDepartment());
         
System.out.println("Year Of Joining : "+e.getYearOfJoining());
         
System.out.println("Salary : "+e.getSalary());

System.out.println("===========================================================");

//Query 3.5 : Get the names of all employees who have joined after 2015?

employeeList.stream().filter(y->y.yearOfJoining>2015).map(Employee::getName).forEach(System.out::println);



//Query 3.6 : Count the number of employees in each departmen

Map<String,Long> emp_per_Dept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

System.out.println(emp_per_Dept);

System.out.println("=============================");
emp_per_Dept.forEach((k,v)->{
	System.out.println(k+":"+v);
});
	


System.out.println("===========================================================");	
//Query 3.7 : What is the average salary of each department?


Map<String,Double> avg_sal=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//System.out.println(avg_sal);
avg_sal.forEach((k,v)->{
	System.out.println(k+":"+v);
	
});


System.out.println("===========================================================");	
//Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?

Optional<Employee> max_age=employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
System.out.println(max_age);



System.out.println("===========================================================");	
//  Query 3.8 : Get the details of youngest male employee in the product development department?

Optional<Employee> min_age=employeeList.stream().filter(z->z.getGender()=="Male" && z.getDepartment()=="Product Development").min(Comparator.comparingInt(Employee::getAge));
//System.out.println(min_age.toString());

//System.out.println(min_age);
System.out.println(min_age.get());


System.out.println("===========================================================");	

	}

}
