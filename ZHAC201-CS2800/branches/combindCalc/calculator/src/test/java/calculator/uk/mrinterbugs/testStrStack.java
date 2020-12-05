package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testStrStack {

  private StrStack strStack;

  @BeforeEach
  public void setup() {
    strStack = new StrStack();
  }


  @Test
  void createIsEmpty() {
    assertEquals(strStack.isEmpty(), true, "Tests to see if the newly created stack is empty.");
  }

  @Test
  // Adds a push methods which can be used to add items to the newly created array.
  void addItemsToStack() {
    String stack = "test";
    strStack.push(stack);
    stack = "test2";
    strStack.push(stack);
    stack = "test3";
    strStack.push(stack);
  }

  @Test
  void getMultipleItemsFromStack() throws EmptyStack {
    String stack = "test";
    strStack.push(stack);
    stack = "test2";
    strStack.push(stack);
    stack = "test3";
    strStack.push(stack);
    assertEquals(strStack.pop(), "test3", "Checks both push and pop are working correctly.");
    assertEquals(strStack.pop(), "test2", "Checks both push and pop are working correctly.");
    assertEquals(strStack.pop(), "test", "Checks both push and pop are working correctly.");
  }
}
