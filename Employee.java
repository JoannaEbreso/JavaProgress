public class Employee{
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(String firstName, String lastName, double salary){
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	
	public void setfirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getfirstName(){
		return firstName;
	}
	
	public void setlastName(String lastName){
		this.lastName=lastName;
	}
	
	public String getlastName(){
		return lastName;
	}
	
	public void setSalary(double salary){
		if(salary>0.0){
			this.salary=salary;
		}
		else{
			
		}
	}
	
	public double getSalary(){
		return salary;
	}

}