package com.github.alexjoybc.datastructure.queensattack2;

import com.github.alexjoybc.runners.TwoDArrayInput;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@RunWith(Parameterized.class)
public class QueensAttackTest extends TwoDArrayInput {

    private final int[] board;
    private final int[] queen;

    public QueensAttackTest(int[] board, int[] queen, int[][] obstacle, int expected) {
        super(obstacle, expected);
        this.board = board;
        this.queen = queen;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {
                        new int[]{4, 0},
                        new int[]{4, 4},
                        new int[][]{},
                        9
                },
                //  1 2 3 4
                // 4m m m x
                // 3    m
                // 2  m
                // 1m
                {
                        new int[]{4, 1},
                        new int[]{4, 4},
                        new int[][]{{3, 4}},
                        6
                },
                //   1 2 3 4 test north south
                // 4   m o m
                // 3 m m x m
                // 2   m o m
                // 1 m
                {
                        new int[]{4, 2},
                        new int[]{3, 3},
                        new int[][]{{4, 3}, {2, 3}},
                        8
                },
                //   1 2 3 4 test north south
                // 4   m o m
                // 3   o x o
                // 2   m o m
                // 1 m
                {
                        new int[]{4, 4},
                        new int[]{3, 3},
                        new int[][]{{4, 3}, {2, 3}, {3, 2}, {3, 4}},
                        5
                },
                //   1 2 3 4 test north south
                // 4   m o m
                // 3   o x o
                // 2 o m o m
                // 1 m
                {
                        new int[]{4, 5},
                        new int[]{3, 3},
                        new int[][]{{4, 3}, {2, 3}, {3, 2}, {3, 4}, {2, 1}},
                        5
                },
                //   1 2 3 4 test north south
                // 4   m o m
                // 3   o x o
                // 2   o o m
                // 1
                {
                        new int[]{4, 5},
                        new int[]{3, 3},
                        new int[][]{{4, 3}, {2, 3}, {3, 2}, {3, 4}, {2, 2}},
                        3
                },
                //   1 2 3 4 test north south
                // 4   m o o
                // 3   o x o
                // 2   o o m
                // 1
                {
                        new int[]{4, 5},
                        new int[]{3, 3},
                        new int[][]{{4, 3}, {2, 3}, {3, 2}, {3, 4}, {2, 2}, {4, 4}},
                        2
                },
                {
                        new int[]{5, 3},
                        new int[]{4, 3},
                        new int[][]{{5, 5}, {4, 2}, {2, 3}},
                        10
                },
                {

                        new int[]{100, 100},
                        new int[]{48, 81},
                        new int[][]{{54, 87},
                                {64, 97}, {42, 75}, {32, 65}, {42, 87}, {32, 97}, {54, 75}, {64, 65}, {48, 87},
                                {48, 75}, {54, 81}, {42, 81}, {45, 17}, {14, 24}, {35, 15}, {95, 64}, {63, 87},
                                {25, 72}, {71, 38}, {96, 97}, {16, 30}, {60, 34}, {31, 67}, {26, 82}, {20, 93},
                                {81, 38}, {51, 94}, {75, 41}, {79, 84}, {79, 65}, {76, 80}, {52, 87}, {81, 54},
                                {89, 52}, {20, 31}, {10, 41}, {32, 73}, {83, 98}, {87, 61}, {82, 52}, {80, 64},
                                {82, 46}, {49, 21}, {73, 86}, {37, 70}, {43, 12}, {94, 28}, {10, 93}, {52, 25},
                                {50, 61}, {52, 68}, {52, 23}, {60, 91}, {79, 17}, {93, 82}, {12, 18}, {75, 64},
                                {69, 69}, {94, 74}, {61, 61}, {46, 57}, {67, 45}, {96, 64}, {83, 89}, {58, 87},
                                {76, 53}, {79, 21}, {94, 70}, {16, 10}, {50, 82}, {92, 20}, {40, 51}, {49, 28},
                                {51, 82}, {35, 16}, {15, 86}, {78, 89}, {41, 98}, {70, 46}, {79, 79}, {24, 40},
                                {91, 13}, {59, 73}, {35, 32}, {40, 31}, {14, 31}, {71, 35}, {96, 18}, {27, 39},
                                {28, 38}, {41, 36}, {31, 63}, {52, 48}, {81, 25}, {49, 90}, {32, 65}, {25, 45},
                                {63, 94}, {89, 50}, {43, 41}},
                        40
                }});
    }

    @Override
    public void printInput() {

        System.out.println("board size: " + board[0]);
        System.out.println("# obstacles: " + board[1]);
        System.out.println("queen postion: row:" + queen[0] + " column:" + queen[1]);

        System.out.println("obstacles:");
        for (int i = 0; i < input.length; i++) {
            System.out.println("row: " + input[i][0] + " column: " + input[i][1]);
        }

    }

    @Override
    public int run() {
        return Solution.queensAttack(board[0], board[1], queen[0], queen[1], input);
    }
}