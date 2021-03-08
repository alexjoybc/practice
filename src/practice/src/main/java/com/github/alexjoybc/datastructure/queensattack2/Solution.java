package com.github.alexjoybc.datastructure.queensattack2;

import java.util.Arrays;

public class Solution {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {


        int maxMovesN = n - r_q;
        int maxMovesNE = Math.min(n - r_q, n - c_q);
        int maxMovesE = n - c_q;
        int maxMovesSE = Math.min(n - c_q, r_q - 1);
        int maxMovesS = r_q - 1; // 3
        int maxMovesSW = Math.min(r_q - 1, c_q - 1);
        int maxMovesW = c_q - 1;
        int maxMovesNW = Math.min(n - r_q, c_q - 1);



        // adjust max moves based on the obstacle position
        for (int i = 0; i < obstacles.length; i++) {

            // adjust north and south
            if (obstacles[i][1] == c_q) {

                // adjust north
                if (obstacles[i][0] > r_q && obstacles[i][0] - r_q - 1 < maxMovesN)
                    maxMovesN = obstacles[i][0] - r_q - 1;

                // adjust south
                if (obstacles[i][0] < r_q && r_q - obstacles[i][0] - 1 < maxMovesS)
                    maxMovesS = r_q - obstacles[i][0] - 1;

            }


            // adjust east and west
            if (obstacles[i][0] == r_q) {

                // adjust east
                if (obstacles[i][1] > c_q && obstacles[i][1] - c_q - 1 < maxMovesE)
                    maxMovesE = obstacles[i][1] - c_q - 1;

                // adjust west
                if (obstacles[i][1] < c_q && c_q - obstacles[i][1] - 1 < maxMovesW)
                    maxMovesW = c_q - obstacles[i][1] - 1;

            }

            // adjust diagonals
            if (Math.abs(obstacles[i][0] - r_q) == Math.abs(obstacles[i][1] - c_q)) {

                // adjust north east
                if (obstacles[i][0] > r_q && obstacles[i][1] > c_q && obstacles[i][0] - r_q - 1 < maxMovesNE)
                    maxMovesNE = obstacles[i][0] - r_q - 1;

                // adjust north west
                if (obstacles[i][0] > r_q && obstacles[i][1] < c_q && obstacles[i][0] - r_q - 1 < maxMovesNW)
                    maxMovesNW = obstacles[i][0] - r_q - 1;

                // adjust south east
                if (obstacles[i][0] < r_q && obstacles[i][1] > c_q && r_q - obstacles[i][0] - 1 < maxMovesSE)
                    maxMovesSE = r_q - obstacles[i][0] - 1;

                // adjust south west
                if (obstacles[i][0] < r_q && obstacles[i][1] < c_q && r_q - obstacles[i][0] - 1 < maxMovesSW)
                    maxMovesSW = r_q - obstacles[i][0] - 1;


            }


        }

        return maxMovesN + maxMovesNE + maxMovesE + maxMovesSE + maxMovesS + maxMovesW + maxMovesSW + maxMovesNW;


    }

}
