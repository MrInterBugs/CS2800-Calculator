package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testEmptyStack {

  private EmptyStack emptyStack; // Automatically adds this class using eclipse.
  private Stack stack;

  @BeforeEach
  public void setup() {
    stack = new Stack();
  }

  @Test
  void testExcpetion() {
    assertThrows(EmptyStack.class, () -> {
      stack.pop();
    });
  }
}
