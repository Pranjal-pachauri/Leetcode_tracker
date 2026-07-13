// Last updated: 7/13/2026, 10:03:59 AM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0, count1 = 0;

        for (int s : students) {
            if (s == 0) count0++;
            else count1++;
        }
        
        
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (count0 > 0) count0--;
                else return count1; 
            } else {
                if (count1 > 0) count1--;
                else return count0; 
            }
        }
        
        return 0;
    }
}
