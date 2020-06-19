public class Exercise422{
    public static void main(String[] args){
        System.out.println("N  10*N  100*N  1000*N");
        int N = 1;
        while(N<=5){
            System.out.printf("%d  %d    %d    %d%n",N,10*N,100*N,1000*N);
            N++;
        }
    }
}