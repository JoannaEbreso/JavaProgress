import java.security.SecureRandom;

public class Frequency{
    public static void main(String[] args){
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7]; // array of frequency counters

        // roll die 6,000,000 times; use die value as frequency index
        for (int roll = 1; roll <= 6000000; roll++){
            ++frequency[1 + randomNumbers.nextInt(6)];

            System.out.println(frequency);
        }
    }
}