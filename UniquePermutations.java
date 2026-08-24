import java.util.*;

public class UniquePermutations {
	Set<List<Integer>> ans = new HashSet<>();

	public List<List<Integer>> PermuteUnique(int[] nums) {
		helper(0, nums, new ArrayList<Integer>());

		List<List<Integer>> ListOfLists = new ArrayList<>(ans);

		return ListOfLists;
	}

	public void helper(int idx, int nums[], ArrayList<Integer> curr) {
        if(curr.size() == nums.length){
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        
        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i - 1]) continue;
            curr.add(nums[i]);
            swap(nums, i, idx);
            
            helper(idx + 1, nums, curr);
            
            swap(nums , i , idx);
            curr.remove(curr.size() - 1);
        }
	}
	
	public void swap(int[] nums, int i , int idx){
	    int temp = nums[i];
	    nums[i] = nums[idx];
	    nums[idx] = temp;
	}
	
	public static void main (String[] args) {
	    UniquePermutations obj = new UniquePermutations();
	    int[] nums = {1, 1, 3};
	    List<List<Integer>> result = obj.PermuteUnique(nums);
	    System.out.println(result);
	}   

}
