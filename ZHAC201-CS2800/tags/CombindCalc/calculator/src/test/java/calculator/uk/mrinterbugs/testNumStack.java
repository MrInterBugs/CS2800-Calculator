package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testNumStack {

  private NumStack numStack;

  @BeforeEach
  public void setup() {
    numStack = new NumStack();
  }


  @Test
  void createIsEmpty() {
    assertEquals(numStack.isEmpty(), true, "Tests to see if the newly created stack is empty.");
  }

  @Test
  // Adds a push methods which can be used to add items to the newly created array.
  void addItemsToStack() {
    Float number = (float) 1.0;
    numStack.push(number);
    number = (float) 7.3;
    numStack.push(number);
    number = (float) 13.1;
    numStack.push(number);
  }

  @Test
  void getMultipleItemsFromStack() throws EmptyStack {
    Float number = (float) 1.0;
    numStack.push(number);
    number = (float) 7.3;
    numStack.push(number);
    number = (float) 13.1;
    numStack.push(number);
    assertEquals(numStack.pop(), (float) 13.1, "Checks both push and pop are working correctly.");
    assertEquals(numStack.pop(), (float) 7.3, "Checks both push and pop are working correctly.");
    assertEquals(numStack.pop(), (float) 1.0, "Checks both push and pop are working correctly.");
  }
}
