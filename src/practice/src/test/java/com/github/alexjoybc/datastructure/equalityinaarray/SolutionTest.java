package com.github.alexjoybc.datastructure.equalityinaarray;

import com.github.alexjoybc.runners.SingleArrayInput;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@RunWith(Parameterized.class)
public class SolutionTest extends SingleArrayInput {


    public SolutionTest(int[] input, int expected) {
        super(input, expected);
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][] {
                {new int[] {3, 3, 2, 1, 3}, 2},
                {new int[] {1, 2, 3, 1, 2, 3, 3, 3}, 4}
        });
    }

    @Override
    public int run() {
        return Solution.equalizeArray(input);
    }
}