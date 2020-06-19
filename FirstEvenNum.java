public class FirstEvenNum{
    public static void main(String[] args){
        int counter = 1;
        int total = 0;

        while(counter<=20){
            if(counter%2==0){
                total=total+counter;
            }
            counter++;
        }

        System.out.println(total);



       /* while(counter<=20){                     
                total = total + counter;
                counter=counter+2;
        }
        System.out.println(total);*/
    }
}