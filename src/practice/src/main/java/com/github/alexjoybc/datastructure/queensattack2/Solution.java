package com.github.alexjoybc.datastructure.queensattack2;

public class Solution {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

        int moves = 0;

        int maxMovesN = n - r_q;
        int maxMovesNE = Math.min(n - r_q, n - c_q);
        int maxMovesE = n - c_q;
        int maxMovesSE = Math.min(n - c_q, r_q - 1);
        int maxMovesS = r_q - 1; // 3
        int maxMovesSW = Math.min(r_q - 1, c_q - 1);
        int maxMovesW = c_q - 1;
        int maxMovesNW = Math.min(n - r_q, c_q - 1);

        for(int i = 0; i < obstacles.length; i++) {

            // is the ostacle south
            // 3 / 4
            // 4 - 3
            if(obstacles[i][1] == c_q && r_q - obstacles[i][1] - 1 < maxMovesS) maxMovesS =  r_q - obstacles[i][1] - 1;



        }


        return maxMovesN + maxMovesNE + maxMovesE + maxMovesSE + maxMovesS + maxMovesW + maxMovesSW + maxMovesNW;


    }


}
