package progress;

import java.util.Scanner;
public class Student{
	private String firstName;
	private String lastName;
	private int level;
	private double grade;
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLevel(int level){
		this.level=level;
	}
	public int getLevel(){
		return level;
	}
	public void setGrade(double grade){
		this.grade=grade;
	}
	public double getGrade(){
		return grade;
	}
	public int promote(){
		if(grade>3.5){
		level=level + 100;
		}
		return level;
	}
	public static void main(String... args){
		Student obj=new Student();
		System.out.println("Enter your First Name: ");
		Scanner input=new Scanner(System.in);
		String firstName=input.next();
		obj.setFirstName(firstName);

		System.out.println("Enter your Last Name: ");
		String lastName=input.next();
		obj.setLastName(lastName);

		System.out.println("Enter your Level: ");
		int level=input.nextInt();
		obj.setLevel(level);
	
		System.out.println("Enter your Grade: ");
		double grade=input.nextDouble();
		obj.setGrade(grade);

		System.out.printf("%s %s, You have been promoted to Level %d", firstName, lastName, obj.promote());
}
}
