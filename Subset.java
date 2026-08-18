import java.util.*;

public class Subset {
	List<List<Integer>> output = new ArrayList<>();

	public List<List<Integer>> subsets(int[] nums) {
		int n = nums.length;

		helper(0, new ArrayList<Integer>(), nums);
		return output;
	}

	public void helper(int first, ArrayList<Integer> curr, int[] nums) {
		if(first == nums.length) {
			output.add(new ArrayList<>(curr));
			return;
		}
		helper(first + 1, curr, nums);

		curr.add(nums[first]);
		helper(first + 1, curr, nums);

		curr.remove(curr.size() - 1);
	}

	public static void main (String[] args) {
		Subset obj = new Subset();
		int[] nums = {1, 2, 3};

		List<List<Integer>> result = obj.subsets(nums);
		System.out.println(result);
	}
}
