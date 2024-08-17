package me.archil.sorting;

public class InsertionSort {

  public int[] sort(int[] arr) {

    int[] nums = arr.clone();

    for (int i = 1; i < nums.length; i++) {

      int j = i;

      while (j > 0 && nums[j] < nums[j - 1]) {
        int temp = nums[j];
        nums[j] = nums[j - 1];
        nums[j - 1] = temp;
        j--;
      }
    }

    return nums;
  }

}
