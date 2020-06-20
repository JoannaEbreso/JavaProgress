package progress;
// JOANNA EBRESO

import java.util.Scanner;
public class CovidDiagnosis{
    private int result;
    
    private CovidDiagnosis(int result){
        this.result=result;
    }

    private void setResult(int value){
        result=result+value;
    }

    private int getResult(){
        return result;
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        CovidDiagnosis obj=new CovidDiagnosis(0);

        System.out.println("Do you have cough? ");
        String answer;
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        
        if(answer.equals("yes")){
                obj.setResult(1);
            }
            System.out.println();
        
        System.out.println("Do you have a runny nose? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(1);
        }
        System.out.println();

        System.out.println("Are you having diarrhea? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(1);
        }
        System.out.println();
        
        System.out.println("Do you have headache? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(1);
        }
        System.out.println();

        System.out.println("Are you experiencing MYALGIA or body aches? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(1);
        }
        System.out.println();

        System.out.println("Are you having sore throat? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(1);
        }
        System.out.println();

        System.out.println("Are you having fever (temperature 37.8C and above)? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(1);
        }
        System.out.println();

        System.out.println("Are you having difficulty breathing? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(2);
        }
        System.out.println();

        System.out.println("Are you experiencing fatigue? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(2);
        }
        System.out.println();

        System.out.println("Have you travelled recently during the past 14days? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(3);
        }
        System.out.println();

        System.out.println("Do you have a travel history to COVID-19 INFECTED AREA? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(3);
        }
        System.out.println();

        System.out.println("Do you have direct contact or taking care of a positive CONVID-19 PATIENT? ");
        do {
            System.out.println("Enter yes or no please... and in small letters ");
            answer=input.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        if (answer.equals("yes")){
            obj.setResult(3);
        }
        System.out.println();

        int result=obj.getResult();

        if(result>0 && result<=2 ){
        System.out.printf("Your score is: %d%n", result);
        System.out.println("RECOMMENDATION: It may be stress related. Observe");
        }

        else if(result>=3 && result<=5 ){
            System.out.printf("Your score is: %d%n", result);
            System.out.println("RECOMMENDATION: Hydrate properly and observe proper personal hygiene.");
            System.out.println("Observe and re-evaluate after 2 days");
        }
        
        else if(result>=6 && result<12 ){
            System.out.printf("Your score is: %d%n", result);
            System.out.println("RECCOMMENDATION: Seek consultation with a doctor");
        }

        else if(result>=12 && result<=20 ){
            System.out.printf("Your score is: %d%n", result);
            System.out.println("RECOMMENDATION: YOU NEED TO CALL THE NCDC HOTLINE 080097000010");
        }

        else{
            System.out.println("You're okay");
        }
         
    }


}