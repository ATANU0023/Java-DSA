import java.util.Scanner;

public class MultidimentionalArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
            1,2,3
            4,5,6
            7,8,9
        */ 
        //syntax:
        int[][]arr = new int[3][];//not necessarry to give the column number. but row number is important.

        int[][] array={
            {1,2,3}, // 0th index
            {4,5},  // 1st index
            {7,8,9,4,6} //2nd index -> arr2D[2] //=> {7,8,9,4,6} //// arr2D[2][1] //=> 8
        };
        int[][] arr2D = new int[3][2];

        // input
        for(int row=0;row<arr2D.length;row++){
            for(int  col = 0;col<arr2D[row].length;col++){
                arr2D[row][col] = sc.nextInt();
            }
        }



    }
}
