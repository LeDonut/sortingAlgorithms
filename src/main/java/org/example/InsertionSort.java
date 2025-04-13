package org.example;

public class InsertionSort {

    public int[] sort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
           int temp = nums[i];
           int j = i - 1;

           while (j >= 0 && nums[j] > temp) {
               nums[j + 1] = nums[j];
               j = j - 1;
           }

           nums[j + 1] = temp;
        }

        return nums;
    }
}
