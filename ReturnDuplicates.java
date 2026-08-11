import java.util.*;

public class ReturnDuplicates {
	public static void main (String[] args) {
		try(Scanner scn = new Scanner(System.in)) {
			ReturnDuplicates obj = new ReturnDuplicates();

			System.out.println("Enter the number of elements: ");
			int n = scn.nextInt();

			int[] arr = new int[n];

			System.out.println("Enter the elements: ");
			for(int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			int[] result = obj.findDuplicates(arr);

			if(result.length > 0) {
				System.out.println("Duplicates found: ");
				for(int num : result) {
					System.out.println(num + " ");
				}
			} else {
				System.out.println("No duplicates found");
			}
		}
	}

	public int[] findDuplicates(int[] arr) {
		Set<Integer> uniqueValues = new HashSet<>();
		Set<Integer> duplicateValues = new HashSet<>();

		for(int num : arr) {
			if (!uniqueValues.add(num)) {
				duplicateValues.add(num);
			}
		}

		int[] result = new int[duplicateValues.size()];
		int index = 0;

		for(int num : duplicateValues) {
			result[index] = num;
			index++;
		}
		return result;
	}
}
