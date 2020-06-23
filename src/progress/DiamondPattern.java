package progress;

public class DiamondPattern {
    public static void main(String[] args) {
        int numOfLines = 9;
        int numOfSpaces = numOfLines/2;
        int numOfStars = 1;

        for(int i=1; i<=numOfLines; i++){
            for(int j=1; j<=numOfSpaces; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=numOfStars;k++){
                System.out.print("*");
            }

            if (i<(numOfLines/2)+1){
                   numOfSpaces--;
                   numOfStars+=2;
               }
            else{
                   numOfSpaces++;
                   numOfStars-=2;
               }
           System.out.println();
       }
    }
}
