package progress;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter a sequence of numbers: ");
       int input = sc.nextInt();
       String originalNum = String.valueOf(input);
       

       while(originalNum.length()!=5) {
           System.out.println("Please enter a number with 5 digits: ");
           input = sc.nextInt();
           originalNum = String.valueOf(input);
       }

       String newNum = "";
       for (int counter = 0; counter < originalNum.length(); counter++) {
            char c = originalNum.charAt(originalNum.length()-counter-1);
            newNum = newNum + c;
       }

      if(originalNum.equals(newNum)){
          System.out.println(originalNum + " is a palindrome");
      }
    }
}
