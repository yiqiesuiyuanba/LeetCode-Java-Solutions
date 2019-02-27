import java.util.HashMap;

/**
 *
 *Time: O(n)
 * Space: O(n)
 *
 */


public class ContainsDuplicateII_219 {
    public boolean containsDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if ((i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
