package me.archil.utils;

public class Helpers {
  public static void outputArray(int[] nums, String title) {
    if (title != null)
      System.out.println(title);
    for (int each : nums) {
      System.out.print(each + " ");
    }
    System.out.println();
  }
}
