import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,8,2,5,9,2};
        System.out.println("результат: " + Arrays.toString(findAll(arr1, 5)));
    }
    public static int[] findAll(int[] arr, int x)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) count ++;
        }
        int[] output = new int[count];
        int k=0;
        for(int j=0; j < arr.length; j++) {
            if (arr[j]==x) {output[k]=j; k++; }
        }
        return output ;
    }
}