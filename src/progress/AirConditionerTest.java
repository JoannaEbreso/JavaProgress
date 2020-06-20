package progress;

public class AirConditionerTest{
	public static void main(String[]args){
		AirConditioner obj1=new AirConditioner("LG",16);
		obj1.setColor("Red");
		String newColor= obj1.getColor();
		int newTemp=obj1.increaseTemp();
		String name=obj1.getName();
		System.out.printf("The temperature for %s is %d%n", name,newTemp);
		System.out.printf("The color of %s is %s",name,newColor);
	}

}