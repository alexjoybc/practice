package com.github.alexjoybc.datastructure.jumpingontheclouds;


import com.github.alexjoybc.runners.SingleArrayInput;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@RunWith(Parameterized.class)
public class JumpingOnTheCloudTest extends SingleArrayInput {

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][] {
                {new int[] {0, 0, 1, 0, 0, 1, 0}, 4},
                {new int[] {0, 0, 0, 1, 0, 0}, 3}
        });
    }


    public JumpingOnTheCloudTest(int[] testCase, int expected) {
        super(testCase, expected);
    }

    public int run() {
        return Solution.jumpingOnClouds(input);
    }


}
