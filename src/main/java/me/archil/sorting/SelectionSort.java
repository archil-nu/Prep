package me.archil.sorting;

public class SelectionSort {

  public int[] sort(int[] arr) {
    int[] nums = arr.clone();

    for (int i = 0; i < nums.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[min] > nums[j]) {
          min = j;
        }
        if (min != i) {
          int temp = nums[i];
          nums[i] = nums[min];
          nums[min] = temp;
        }
      }
    }

    return nums;
  }
}
