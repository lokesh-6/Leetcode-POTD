import java.util.*;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> l = new ArrayList<>();
        int MOD = 1000000007;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = (sum + nums[j]) % MOD;
                l.add(sum);
            }
        }
        Collections.sort(l);
        int ans = 0;
        for (int i = left - 1; i < right; i++) {
            ans = (ans + l.get(i)) % MOD;
        }
        return ans;
    }
}


public class Ranged_sum_of_Sorted {
    
}
