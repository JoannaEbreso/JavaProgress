package progress;

import java.util.Scanner;
public class Volumes{
    public static void main(String[]args){
        System.out.println("Enter the radius of the sphere:");
        Scanner sc = new Scanner(System.in);
        double radius=sc.nextDouble();
    
        System.out.printf("The volume of the sphere with radius %f is %f", radius, sphereVolume(radius));
    }
    public static double sphereVolume(double radius){
        double volume=(4.0/3.0) * Math.PI * Math.pow(radius,3);
        return volume;
    }
    
}