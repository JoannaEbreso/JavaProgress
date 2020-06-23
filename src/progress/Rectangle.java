package progress;

public class Rectangle{
	private int length;
	private int width;
	
	public void setLength(int length){
		this.length=length;
	}
	public int getLength(){
		return length;
	}
	public void setWidth(int width){
		this.width=width;
	}
	public int getWidth(){
		return width;
	}
	public int calculateArea(){
		int area=length*width;
		return area;
	}
	public int calculatePeri(){
		int perimeter=2*(length+width);
		return perimeter;
	}
}