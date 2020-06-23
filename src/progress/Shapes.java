package progress;

public class Shapes{
	private double length;
	private double width;
	private float radius;
	private String typeofShape;

	public Shapes(double length, double width, String rectangle){
		this.length=length;
		this.width=width;
		typeofShape=rectangle;
	}
	
	public Shapes(double length, String square){
		this.length=length;
		typeofShape=square;
	}
	
	public Shapes(float radius, String circle){
		this.radius=radius;
		typeofShape=circle;
	}

	public void setLength(double length){
		this.length=length;
	}
	
	public double getLength(){
		return length;
	}

	public void setWidth(double width){
		this.width=width;
	}

	public double getWidth(){
		return width;
	}
	
	public void setRadius(float radius){
		this.radius=radius;
	}
	
	public float getRadius(){
		return radius;
	}
	
	public double calArea(){
		double area = 0.0;
		if (typeofShape=="rectangle")
			return area=length*width;

		if (typeofShape=="square")
			return area=length*length;
		
		if (typeofShape=="circle"){
			float pi = (float)3.14;
			float areaFloat=pi*radius*radius;
			return area = (double) areaFloat;
		}
	return area;
	}
}