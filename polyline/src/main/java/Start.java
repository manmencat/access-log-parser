import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 8, -11, 12};
        int[] ins = {3, 4, 5, 6};

        int[] arr1 = add(arr, ins, 2);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] add(int[] arr, int[] ins, int pos) {
        {
            int[] myArray = new int[arr.length + ins.length];

            for (int i = 0; i < arr.length; i++) {
                if(i<pos){
                    myArray[i] =  arr[i];
                }
                else {
                    myArray[i+ins.length] =  arr[i];
                }
            }

            for (int i = 0; i < ins.length; i++) {
                myArray[i+pos] = ins[i];
            }

            return myArray;
        }
    }
}