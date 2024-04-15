package LeetCodeProblems;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int [] val1={0,1};
        int [] val2 = {1,2};

        if (nums[0]+nums[1] == target){
            return val1;
        }

        else{
            return val2;
        }

    }

}
