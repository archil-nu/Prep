package me.archil.sorting;

/**
 *
 * @author achiko
 */
public class BubbleSort {

    public int[] sort(int[] arr) {
        int[] nums = arr.clone();

        boolean swapped;
        int max = nums.length - 1;
        do {
            swapped = false;
            for (int i = 0; i < max; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
            max--;
        } while (swapped);
        return nums;
    }

}
