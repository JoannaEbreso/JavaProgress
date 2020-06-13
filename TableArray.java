public class TableArray{
    public static void main(String[]args){
        int[][] table = new int[3][3];
        int counter = 0;

        for (int[] rowElements : table){
            for (int elements : rowElements){
                counter+=1;
            }
        }
        System.out.println(counter);
    }
}