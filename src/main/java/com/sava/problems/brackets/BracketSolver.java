package com.sava.problems.brackets;

import com.sava.problems.Solver;

/**
 * @author kateryna.savina
 */
public class BracketSolver implements Solver {
    int open = 0;
    int close = 0;
    int level = 0;

    @Override
    public boolean solve(String brackets) {
        return isCorrect(brackets);
    }

    boolean isCorrect(String brackets) {
        for (char b : brackets.toCharArray()) {
            switch (b) {
                case '(':
                    open++;
                    level++;
                    break;
                case ')':
                    close++;
                    level--;
                    if (level < 0) {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        if (open != close) {
            return false;
        }
        return level == 0;
    }
}