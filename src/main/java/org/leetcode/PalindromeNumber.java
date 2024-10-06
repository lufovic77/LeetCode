package org.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    static class Solution {
        public static boolean isPalindrome(int x) {
            if (x < 0)
                return false;
            List<Integer> list = new ArrayList<>();
            while (x > 0) {
                list.add(x % 10);
                x /= 10;
            }
            int lIdx = 0, rIdx = list.size() - 1;
            while (lIdx < rIdx) {
                if (list.get(lIdx) != list.get(rIdx)) {
                    return false;
                }
                lIdx++;
                rIdx--;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(12));
    }
}
