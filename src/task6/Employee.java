package task6;

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

	    public int getId() {
	        return id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getName() {
	        return firstName + " " + lastName;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	     public int getAnnualSalary() {
	        return salary * 12;
	    }

	    public int raiseSalary(int percent) {
	        this.salary += this.salary * percent / 100;
	        return this.salary;
	    }
	    
	    @Override
	    public String toString() {
	        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(199806, "May", "Flower", 70000);
        System.out.println(employee.toString());
        employee.raiseSalary(10);
        System.out.println(employee.toString()); 
    }

}


