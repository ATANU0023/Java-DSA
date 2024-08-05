
public class array_one {
    public static void main(String[] args) {
        // store a roll no.
        int a = 23;

        //store a person's name
        String name = "atanu pramanik";

        //store 5 roll numbers
        // int a1 = 1;
        // int b = 2;
        // int c = 3;
        // int d = 4;
        // int e = 5;

        // syntax
        // datatype[] variable_name = new datatype[size];
        //store 5 roll numbers
        // int [] rollNumbers = new int[5];
        //or
        // int rolls [] = new int[3];
        //or
        // int roll_num [] = {1,2,3,4,5};

        /* 
         1. Array is collection of same datatypes.
         2. All the data in the array the type must be same.
         3. here the "rollNumbers" is reference variable is pointing to an array object, that is type interger.

         4. int[] ros; // declaration of array. ros is getting defined in the stack.
         5. ros = new int[5] // Initialization: actually, here object is being created in the memory(heap). 
        */

        String [] arr = new String[4];
        System.out.println(arr[2]);

    }
}
