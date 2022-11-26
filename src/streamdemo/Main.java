package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private String city;
	
	
	
	
	
	
	

public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}








public Student() {
	// TODO Auto-generated constructor stub
}








public int getId() {
	return id;
}








public void setId(int id) {
	this.id = id;
}








public String getName() {
	return name;
}








public void setName(String name) {
	this.name = name;
}








public String getCity() {
	return city;
}








public void setCity(String city) {
	this.city = city;
}








@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
}
}

public class Main{
	
	public static void main(String args[]) {
		List<Object> list=new ArrayList<Object>();
		while(true) {
		Scanner sc=new Scanner( System.in);
		
		
		Student obj=new Student();
		System.out.println("Enter the id:");
		obj.setId(sc.nextInt());
		System.out.println("Enter the name:");
		obj.setName(sc.next());
		System.out.println("Enter the city:");
		obj.setCity(sc.next());
		System.out.println(obj);
		list.add(obj);
		
		System.out.println("-------------------------------");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("-----------------------");
		System.out.println(list);
		}
		
	}

	
}






	




