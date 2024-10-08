package org.leetcode.binarysearch;

public class SearchInsertPosition {
    static class Solution {
        static int bs(int[] nums, int left, int right, int target) {
            if (left > right) {
                return left;
            }
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return bs(nums, mid + 1, right, target);
            } else {
                return bs(nums, left, mid - 1, target);
            }
        }

        static int searchInsert(int[] nums, int target) {
            return bs(nums, 0, nums.length - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(Solution.searchInsert(arr, 5));
    }
}
