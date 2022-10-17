//#1
public class ArrayS {

    public static void main(String []args){

        int arr[] = {1,5,6,5,4,1};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        System.out.println("Sum of array is: "+sum);

    }
}