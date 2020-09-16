package com.sava.problems.brackets

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author kateryna.savina
 */
class BracketSolverTest extends Specification {
    def solver = new BracketSolver()

    @Unroll
    def "solve() returns #result for '#brackets'"() {
        expect:
        solver.solve(brackets) == result

        where:
        brackets       | result
        ''             | true
        '()'           | true
        '('            | false
        ')'            | false
        ')('           | false
        '()()'         | true
        '(())'         | true
        '(()'          | false
        '())'          | false
        '(()(()()))()' | true
    }
}
