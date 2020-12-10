package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testPostfixCalculator {
  
  @Test
  void createIsEmpty() throws UserInput, EmptyStack {
    
    assertEquals(PostfixCalculator.evaluate("4 3 2 + 2 * 5 - "), 5.0, "Tests to see if the we get the right calulation.");
    assertEquals(PostfixCalculator.evaluate("5 7 * 5 + 3 *"), 120.0, "Tests to see if the we get the right calulation.");
  }
}
