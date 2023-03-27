import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 34, 6, 78, 8, 9, 32, 1, 34};
        groupByNumbers(nums);

    }
    private static void groupByNumbers(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
// 111111111111111111
        for(int i = 0; i < nums.length; i++) {
            if (!numsMap.containsKey(nums[i])) {
                numsMap.put(nums[i], 1);
            } else {
                numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
            }
        }
        System.out.println(numsMap);
    }
}