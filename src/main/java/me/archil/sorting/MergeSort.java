package me.archil.sorting;

public class MergeSort {

  public int[] merge(int[] first, int[] second) {
    int[] merged = new int[first.length + second.length];
    int i = 0, j = 0;

    while ((i < first.length) && (j < second.length)) {
      if (first[i] < second[j]) {
        merged[i + j] = first[i];
        i++;
      } else {
        merged[i + j] = second[j];
        j++;
      }
    }

    while (i < first.length) {
      merged[i + j] = first[i];
      i++;
    }

    while (j < second.length) {
      merged[i + j] = second[j];
      j++;
    }

    return merged;
  }

  public int[] sort(int[] nums) {
    if ((nums.length == 1) || (nums.length == 0))
      return nums;

    // split
    int mid = nums.length / 2;

    int[] first = new int[mid];
    int[] second = new int[nums.length - mid];

    int i = 0;
    while (i < mid) {
      first[i] = nums[i];
      i++;
    }
    while (i < nums.length) {
      second[i - mid] = nums[i];
      i++;
    }

    int[] sortedFirst = sort(first);
    int[] sortedSecond = sort(second);

    return merge(sortedFirst, sortedSecond);
  }
}
