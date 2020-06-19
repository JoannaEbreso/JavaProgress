public class EvenSum{
    public static void main(String[]args){
        int counter = 1;
        int total = 0;

        while(counter<=10){
            if(counter%2 == 0){
                total = total + counter;
            }
            counter++;
        }
        System.out.println(total);
    }
}