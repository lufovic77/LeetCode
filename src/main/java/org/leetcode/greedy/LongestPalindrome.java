package org.leetcode.greedy;

import java.util.*;

public class LongestPalindrome {
    static class Solution {
        static int longestPalindrome(String s) {
            HashMap<String, Integer> map = new HashMap<>();
            String[] strArr = s.split((""));
            Arrays.stream(strArr).forEach(it -> map.put(it, map.getOrDefault(it, 0) + 1));
            List<Integer> list = map.values().stream().toList();
            ArrayList<Integer> integers = new ArrayList<>(list);
            integers.sort(Comparator.reverseOrder());
            int ret = 0;
            boolean flag = false;
            for (Integer num : integers) {
                if (num % 2 == 1) {
                    if (flag) {
                        ret += (num - 1);
                        continue;
                    }
                    flag = true;
                }
                ret += num;
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
}
