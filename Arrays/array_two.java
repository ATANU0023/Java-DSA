import java.util.Arrays;
import java.util.Scanner;

public class array_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // array of primitives

        int [] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 3;
        // arr[2] = 43;
        // arr[3] = 13;

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));

        // System.out.println("OUTPUT ARRAY:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }


        // FOR EACH LOOP
        // for (int i : arr) { // for every element in array, print the element
        //     System.out.println(i + ""); //here i represents element of the array
        // }

 
        // Array of objects
        String [] str = new String[4];
        for(int i =0;i<str.length;i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }    
}
