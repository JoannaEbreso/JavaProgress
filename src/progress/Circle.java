package progress;

public class Circle{
	private int radius;

	public void setRadius(int radius){
		this.radius=radius;
	}
	
	public double calCircumference(){
		//double circumference=2*Math.PI*radius;
		double circumference=2*3.14*radius;
		//System.out.printf("%f %f %n",circumference, Math.PI);
		return circumference;

	}
}