package com.github.alexjoybc.runners;

import com.github.alexjoybc.datastructure.equalityinaarray.Solution;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.Stopwatch;

import java.util.Arrays;

public abstract class SingleArrayInput extends SingleParamInput<int[]> {


    public SingleArrayInput(int[] input, int expected) {
        super(input, expected);
    }

    @Override
    public void printInput() {
        System.out.println(Arrays.toString(input));
    }
}
