import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Prac3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scn.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols = scn.nextInt();

        int[][] array2D = new int[rows][cols];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                array2D[i][j] = scn.nextInt();
            }
        }
        

        int result = isNonZero(array2D);

        System.out.println(result);
    }

    public static int isNonZero(int[][] array2D){
        int count = 0;
        boolean isNonZeroRow = true;
        for(int i = 0; i < array2D.length; i++){
            
            for(int j = 0; j < array2D[i].length; j++){
                if(array2D[i][j] == 0){
                    isNonZeroRow = false;
                    break;
                }
            }
            if(isNonZeroRow){
                count++;
            }
        }
        return count;
    }
}
