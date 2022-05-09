import java.util.Arrays;

public class ArraysExemple {
    public static void SortInt(int[] input){
        if(input == null || input.length == 0)
            System.out.println("The Array is empty");
        else{
            Arrays.sort(input);
            int a = Arrays.binarySearch(input, 5);
            System.out.println(a);
            for(int i = 0; i < input.length; i++){
                System.out.print(input[i] + " ");
            }
        }

    }
}
