import java.util.*;

public class GetSubArray {
    public int[] subArray(int[] arr, int startIndex, int endIndex){
        int length = endIndex - startIndex + 1;
        
        int[] result = new int[length];
        
        for(int i = startIndex; i <= endIndex; i++){
            result[i - startIndex] = arr[i];
        }
        
        return result;
    }
    
    public static void main (String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            GetSubArray obj = new GetSubArray();
            
            System.out.println("Enter the no. of elements in the array: ");
            int n = scn.nextInt();
            
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            
            System.out.println("Enter the starting index of subarray: ");
            
            int startIndex = scn.nextInt();
            
            System.out.println("endIndex: ");
            int endIndex = scn.nextInt();
            
            int[] hi = obj.subArray(arr, startIndex, endIndex);
            
            for(int num : hi){
                System.out.print(num + " ");
            }
        }
    }
}
