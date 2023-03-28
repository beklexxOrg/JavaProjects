import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("starting...");
        int[] nums = {1, 2, 34, 6, 78, 8, 9, 32, 1, 34};
        groupByNumber(nums);
    }
    private static void groupByNumber(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for(int j = 0; j < nums.length; j++) {
            if (!numsMap.containsKey(nums[j])) {
                numsMap.put(nums[j], 1);
            } else {
                numsMap.put(nums[j], numsMap.get(nums[j]) + 1);
            }
        }
        System.out.println(numsMap);
        System.out.println("End of work");
    }
}