public class Employee {


	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getID() {
	
		return this.id;
	}

	public String getFirstname() {
	
		return this.firstName;
	}

	public String getLastName() {
	
		return this.lastName;
	}

	public String getName() {
	
		return this.firstName + " " + this.lastName;
	}

	public int getSalary() {
	
		return this.salary;
	}

	public void setSalary(int salary) {
	
		this.salary = salary;
	}

	public int getAnnualSalary() {

		return salary * 12;
	}

	public int raiseSalary(int percent) {

		return this.salary += this.salary * percent/100;
	}

	public String toString() {
		
		return String.format("Employee[id=%d,name=%s ,salary=%d]", this.id, this.getName(), this.salary);
	}


}
