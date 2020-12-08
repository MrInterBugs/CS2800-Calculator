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
  
  @SuppressWarnings("static-access")
  @Test
  void testIsInt() {
    InfixCalculator infix = new InfixCalculator();
    String i = "1";
    assertEquals(infix.isInteger(i), true, "Tests to see if the input is an interger.");
    i = "500";
    assertEquals(infix.isInteger(i), true, "Tests to see if the input is an interger.");
    i = "Test";
    assertEquals(infix.isInteger(i), false, "Tests to see if the input is an interger.");
  }
  
  @SuppressWarnings("static-access")
  @Test
  void testIsSymbol() {
    InfixCalculator infix = new InfixCalculator();
    String i = "*";
    assertEquals(infix.isSymbol(i), true, "Tests to see if the input is an valid calculation symbol.");
    i = "/";
    assertEquals(infix.isSymbol(i), true, "Tests to see if the input is an valid calculation symbol.");
    i = "!";
    assertEquals(infix.isSymbol(i), false, "Tests to see if the input is an valid calculation symbol.");
  }
  
  @Test
  void createInfixAnswers() throws UserInput, EmptyStack {
    assertEquals(InfixCalculator.evaluate("3 + 2"), 5.0, "Tests to see if the we get the right calulation.");
    assertEquals(InfixCalculator.evaluate("3 + 2 + 1"), 6.0, "Tests to see if the we get the right calulation.");
    assertEquals(InfixCalculator.evaluate("( 3 * 2 ) + 1"), 7.0, "Tests to see if the we get the right calulation.");
    assertEquals(InfixCalculator.evaluate("( ( 3 + 2 + 3 ) * 2 + 3 ) - 9 + 3 * 2"), 16.0, "Tests to see if the we get the right calulation.");
  }
  
}
