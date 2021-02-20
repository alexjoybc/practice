package com.github.alexjoybc.runners;

import com.github.alexjoybc.datastructure.equalityinaarray.Solution;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.Stopwatch;

import java.util.Arrays;

public abstract class SingleArrayInput {

    protected final int[] input;
    private final int expected;

    public SingleArrayInput(int[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    public abstract int run();

    @Test
    public void runTest() {

        System.out.println("input: " + Arrays.toString(input));

        StopWatch watch = new StopWatch();
        watch.start();
        int result = run();
        watch.stop();

        Assertions.assertEquals(expected, result);

        System.out.println("Time Elapsed: " + watch.getNanoTime() / 1000 + " micro seconds");

    }

}
