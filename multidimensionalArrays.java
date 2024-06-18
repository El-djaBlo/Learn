package DSA_java;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalArrays {
    /*
    1 2 3
    4 5 6
    7 8 9
     */
    public static void main(String[] args) {
        // declaring no of rows is mandatory, you can leave the column box
        // when you use array.length for a 2d array it will give you number of rows.
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of rows:- ");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][rows];
        // you can imagine 2d array as array of arrays.
        for(int i=0;i<rows;i++){
            for(int j = 0;j<rows;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//         printing 2d array
//        to print 2d array you can't simply use System.out.println(Arrays.toString(arr));
//        you have to use it inside for loop specific for arrays as mentioned below
//        in this enhanced for loop the data type of i will be the data type of the array
        for(int[] i: arr){
           System.out.println(Arrays.toString(i));
        }


//this is my changes to the original code 
//this is a comment ***
//        System.out.println(Arrays.toString(arr));
    }

}
