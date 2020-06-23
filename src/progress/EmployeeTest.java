package progress;

public class EmployeeTest{
	public static void main(String[]args){
		Employee employee1=new Employee("Joanna", "Ebreso",50.0);
		Employee employee2=new Employee("Tina", "Turner",60.0);
		
		employee2.setSalary(-5.0);
		System.out.println(employee1.getSalary());
		System.out.println(employee2.getSalary());
	}
}