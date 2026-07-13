// Last updated: 7/13/2026, 10:14:33 AM
class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        bubbleSort(nums,nums.length);

    }
    static void bubbleSort(int arr[], int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            // swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // swapped = true;
                }

            // if (swapped == false)
            //     break;
        }
    }}}
