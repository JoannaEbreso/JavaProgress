import java.security.SecureRandom;
public class RandomGenerator{
    public static void main(String[]args){

        for(int i=0;i<=20;i++){
            SecureRandom dice=new SecureRandom();
            int randomValue= 1+dice.nextInt(6);

            System.out.println(randomValue);
        }
    }
}