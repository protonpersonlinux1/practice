import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Prac2 {
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
        System.out.println("Enter row to check: ");
        int r = scn.nextInt();

        boolean result = isNonZero(r, array2D);

        if(result){
            System.out.println("Row is non zero");
        }else {
            System.out.println("row contains zero");
        }
    }

    public static boolean isNonZero(int r, int[][] array2D){
        for(int i = 0; i < array2D[r].length; i++){
            if(array2D[r][i] == 0){
                return false;
            }
        }
        return true;
    }
}
