package com.github.alexjoybc.datastructure.jumpingontheclouds;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@RunWith(Parameterized.class)
public class SolutionTest {

    private final int[] testCase;
    private final int expected;

    public SolutionTest(int[] testCase, int expected) {
        this.testCase = testCase;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][] {
                {new int[] {0, 0, 1, 0, 0, 1, 0}, 4},
                {new int[] {0, 0, 0, 1, 0, 0}, 3}
        });
    }


    @Test
    public void runTest() {

        int actual = Solution.jumpingOnClouds(testCase);

        Assertions.assertEquals(expected, actual);

    }


}
