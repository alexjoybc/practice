package com.github.alexjoybc.runners;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public abstract class SingleParamInput<T> {


    protected final T input;
    protected final int expected;

    protected SingleParamInput(T input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    public abstract int run();

    public abstract void printInput();

    @Test
    public void runTest() {

        printInput();

        StopWatch watch = new StopWatch();
        watch.start();
        int result = run();
        watch.stop();

        Assertions.assertEquals(expected, result);

        System.out.println("Time Elapsed: " + watch.getNanoTime() / 1000 + " micro seconds");

    }

}
