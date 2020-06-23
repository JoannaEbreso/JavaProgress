package progress;

import java.security.SecureRandom;
public class Joanna{
    public static void main(String[]args){
        char[] myChar = "I love Joanna".toCharArray();

        String out = "";

        SecureRandom securerandom = new SecureRandom();

        int len = securerandom.nextInt(24) + 8;

        for (int i = 0; i<len; ++i){
            out = out + myChar[securerandom.nextInt(myChar.length)];
        }
        System.out.print(out);
    }
}