package progress;

import java.util.Scanner;
public class Airline{
    private boolean[] flightSeats;
    private int capacityValue;
    private int choice;
    Scanner sc = new Scanner(System.in);

    public Airline(int capacityValue){
        flightSeats= new boolean[1+capacityValue];
        this.capacityValue = capacityValue;
    }

   /* public void setCapacity(int capacityValue){
        capacity = new int[capacityValue];
        availability= new boolean[capacityValue];
        for(int i = 0; i<capacity.length; i++){
            capacity[i] = i+1;
            availability[i] = false;
        }
        this.capacityValue = capacityValue;
    }*/

    public void firstClass(){
        for (int num=1; num<=5; num++){
            if (flightSeats[num] == false){
                flightSeats[num] = true;
                System.out.printf("Your seat number is: %d%n", num);
                break;
            }
            else if(flightSeats[5] == true){
                    if(flightSeats[10] == true){
                        System.out.println("The flight is full");
                        System.out.println("The next flight is in 3 hours");
                        System.exit(0);
                    }
                    else{
                        System.out.println("The first class is full");
                        System.out.println("Would you like to go for the Economy class? Press 1 for Yes and 2 for No");
                        choice = sc.nextInt();
    
                        if (choice == 1){
                            economyClass();
                        }
    
                        else{
                            System.out.println("The next flight is in 3 hours");
                            System.exit(0);
                        }
                    }
                }

        }
                  
        
    }


    public void economyClass(){
        for (int num=6; num<11; num++){
            if (flightSeats[num] == false){
                flightSeats[num] = true;
                System.out.printf("Your seat number is: %d%n", num);
                break;
            }
            else if(flightSeats[10] == true){
                    if(flightSeats[5] == true){
                        System.out.println("The flight is full");
                        System.out.println("The next flight is in 3 hours");
                        System.exit(0);
                    }
                    else{
                        System.out.println("The Economy class is full");
                        System.out.println("Only First class is available, Would you like to go for it? Press 1 for Yes and 2 for No");
                        choice = sc.nextInt();
    
                        if (choice == 1){
                            firstClass();
                        }
    
                        else{
                            System.out.println("The next flight is in 3 hours");
                            System.exit(0);
                        }
                    }
                }

        } 
    }
}