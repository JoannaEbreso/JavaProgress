package progress;

public class ArrayFunction{
    public static void main(String[]args){
        int[] array1 = new int[11];
        int[] array2 = new int[34];
        double[] array3 = {3.0,6.0,4.0,2.0,10.0,8.0,11.0,1.0,5.0,6.0};

        for (int i=0; i<array1.length; i++){
           array1[i] = i*2;
           System.out.printf("%d ",array1[i]);
        }
        System.out.println("");

        for (int i=0; i<array2.length; i++){
            array2[i] = i+i*2;
            System.out.printf("%d ",array2[i]);
        }
        
        double smallest = array3[0];
        int x = 1;
        while(x<array3.length){
            if(array3[x]<smallest){
            smallest = array3[x];
            }
            x++;
        }
        System.out.printf("%n");
        System.out.println(smallest);
    }
}