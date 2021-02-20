package com.github.alexjoybc.datastructure.jumpingontheclouds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    /**
     * Return the number of jumps to solve https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
     * Time complexity: O(n)
     * @param c
     * @return
     */
    static int jumpingOnClouds(int[] c) {

        int result = 0;
        int i = 0;

        while(i < c.length - 1) {

            // if cloud at index + 2 is cumulus jump on it
            // othewise jump to the next one since we can always win
            i = (i + 2 < c.length && c[i + 2] == 0) ? i + 2 : i+ 1;

            // add 1 jump
            result++;
        }

        return result;
    }

}