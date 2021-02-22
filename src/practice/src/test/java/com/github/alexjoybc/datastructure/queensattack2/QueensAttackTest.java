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
                {
                        new int[]{4, 0},
                        new int[]{4, 4},
                        new int[][]{{3,4}},
                        8
                },
                {
                        new int[]{5, 3},
                        new int[]{4, 3},
                        new int[][]{{5, 5}, {4, 2}, {2, 3}},
                        10
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