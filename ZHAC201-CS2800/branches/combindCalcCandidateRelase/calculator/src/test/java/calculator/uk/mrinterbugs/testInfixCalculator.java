package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testInfixCalculator {
  
  //Will no longer pass. Has been superseeded by the next test.
  @Test
  void createPostfixFromInfix() throws UserInput, EmptyStack {
    assertEquals(InfixCalculator.evaluate("3 + 2"), "3 2 +", "Tests to see if the we get to posstfix calulation.");
    assertEquals(InfixCalculator.evaluate("3 + 2 + 1"), "3 2 + 1 +", "Tests to see if the we get to posstfix calulation.");
    assertEquals(InfixCalculator.evaluate("( 3 * 2 ) + 1"), "3 2 * 1 +", "Tests to see if the we get to posstfix calulation.");
    assertEquals(InfixCalculator.evaluate("( ( 3 + 2 + 3 ) * 2 + 3 ) - 9 + 3 * 2"), "3 2 + 3 + 2 * 3 + 9 - 3 2 * +", "Tests to see if the we get to posstfix calulation.");
  }
  
  @Test
  void createInfixAnswers() throws UserInput, EmptyStack {
    assertEquals(InfixCalculator.evaluate("3 + 2"), 5.0, "Tests to see if the we get the right calulation.");
    assertEquals(InfixCalculator.evaluate("3 + 2 + 1"), 6.0, "Tests to see if the we get the right calulation.");
    assertEquals(InfixCalculator.evaluate("( 3 * 2 ) + 1"), 7.0, "Tests to see if the we get the right calulation.");
    assertEquals(InfixCalculator.evaluate("( ( 3 + 2 + 3 ) * 2 + 3 ) - 9 + 3 * 2"), 16.0, "Tests to see if the we get the right calulation.");
  }
}
