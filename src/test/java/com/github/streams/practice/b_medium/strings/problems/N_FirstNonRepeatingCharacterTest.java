package com.github.streams.practice.b_medium.strings.problems;

import com.github.streams.practice.b_medium.ProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Given a String find the first non-repeating character:
 *
 * <p>String = The quick brown fox jumps over the lazy dog, find the first non-repeated character.
 * (Google interview)
 */
class N_FirstNonRepeatingCharacterTest {
  @Test
  @Disabled
  void testFirstNonRepeatingCharacter() {
    final var input =
        "The quick brown fox jumps over the lazy dog, find the first non repeated character.";
    final var yourSolution = ' ';
    final var mySolution = ProblemSolutions.firstNonRepeatingCharacter(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
