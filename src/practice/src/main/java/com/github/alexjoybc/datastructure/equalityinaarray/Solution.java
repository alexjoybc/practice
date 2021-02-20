package com.github.alexjoybc.datastructure.equalityinaarray;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;


public class Solution {


    /**
     * * Return the number of jumps to solve https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
     * Time complexity: O(n)
     * @param arr
     * @return
     */
    static int equalizeArray(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        // store the max count
        int maxCount = 0;

        for(int i = 0; i < arr.length; i++) {

            Integer count = map.get(arr[i]);
            Integer updatedCount = count == null ? 1 : count + 1;

            map.put(arr[i], updatedCount);
            if(updatedCount > maxCount) maxCount = updatedCount;

        }

        // return array length - maxcount
        return arr.length - maxCount;

    }

}
