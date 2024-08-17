/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.archil;

import java.util.ArrayList;
import java.util.List;

import me.archil.sorting.BubbleSort;
import me.archil.sorting.InsertionSort;
import me.archil.sorting.MergeSort;
import me.archil.sorting.SelectionSort;
import me.archil.utils.Helpers;

/**
 *
 * @author achiko
 */
public class MainPrep {

    public static void main(String[] args) {
        int[] nums = { 5, 3, 8, 4, 2, 1, 5, 3, 8, 4, 2, 1, 5, 3, 8, 4, 2, 1 };

        int[] sorted = new MergeSort().sort(nums);

        Helpers.outputArray(nums, "Unsorted");
        Helpers.outputArray(sorted, "Sorted");
    }
}
