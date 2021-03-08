package com.github.alexjoybc.runners;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public abstract class TwoDArrayInput extends SingleParamInput<int[][]> {

    public TwoDArrayInput(int[][] input, int expected) {
        super(input, expected);
    }

    @Override
    public void printInput() {
        System.out.println("input: " + Arrays.toString(input));
    }

}
