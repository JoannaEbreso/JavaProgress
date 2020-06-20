package progress;

public class AirConditioner{
	private int temperature;
	private String color;
	private int width;
	private String name;
	private double capacity;

	public AirConditioner(String name, int temperature){
		this.name = name;
		this.temperature = temperature;
	}
	public AirConditioner(String color){
		this.color = color;
		
	}
  	public AirConditioner(int width){
		this.width = width;
	}
	public AirConditioner(double capacity){
		this.capacity = capacity;
	}
	
	public void setTemperature(int temperature){
		this.temperature = temperature;
	}	
	
	public int getTemperature(){
		return temperature;
	}
	
	public void setColor(String color){
		this.color = color;
	}	
	
	public String getColor(){
		return color;
	}
	
	public void setWidth(int width){
		this.width = width;
	}	
	
	public int getWidth(){
		return width;
	}
	
	public void setName(String name){
		this.name = name;
	}	
	
	public String getName(){
		return name;
	}
	
	public void setCapacity(double capacity){
		this.capacity = capacity;
	}	
	
	public double getCapacity(){
		return capacity;
	}

	public int increaseTemp(){
		temperature = temperature + 4;
		return temperature;
	}
	
 }	