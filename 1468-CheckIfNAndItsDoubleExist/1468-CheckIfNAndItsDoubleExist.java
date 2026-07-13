// Last updated: 7/13/2026, 10:05:09 AM
import java.util.HashSet;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2)|| (num % 2 == 0 && set.contains(num / 2))) {
              return true;
            }
            set.add(num);
        }
        return false;
    }
}