import java.util.*;

public class SubsetsWithDup {

	Set<List<Integer>> output = new HashSet<>();

	public List<List<Integer>> subsetswithdup(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);

		helper(0, new ArrayList<Integer>(), nums);

		List<List<Integer>> ans = new ArrayList<>(output);
		return ans;
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
	    SubsetsWithDup obj = new SubsetsWithDup();
	    
	    int[] nums = {1, 2, 2, 3};
	    List<List<Integer>> result = obj.subsetswithdup(nums);
	    System.out.println(result);
	}
}
