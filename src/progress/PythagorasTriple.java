package progress;

public class PythagorasTriple {
    public static int power(int number,int exponent){
        int square = 1;
        for(int i=1;i<=exponent; i++){
            number=number*square;
            square=number;
        }
        return square;
    }
    public static void main(String[] args) {
        System.out.printf("%s %10s %15s%n","Side1","Side2","Hypotenuse");
        for(int firstSide=1; firstSide<=500; firstSide++){
            for(int secondSide=1; secondSide<=500; secondSide++){
                for(int hypo=1; hypo<=500; hypo++){
                    int firstSquare = power(firstSide,2);
                    int secondSquare = power(secondSide,2);
                    int hypoSquare = power(hypo,2);

                    if((firstSquare+secondSquare)==hypoSquare){
                        System.out.printf("%d %10d %15d%n",firstSide,secondSide,hypo);
                    }
                }
            }
        }
    }
}
