package employee.com;

public class Employee {
	
	private String name;
	private String dpt;
	private double salary;
	
	
	


	public Employee(String name, String dpt, double salary) {
		super();
		this.name = name;
		this.dpt = dpt;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDpt() {
		return dpt;
	}


	public void setDpt(String dpt) {
		this.dpt = dpt;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", dpt=" + dpt + ", salary=" + salary + "]";
	}
	
	

}
