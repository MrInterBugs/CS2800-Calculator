package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testOpStack {

  private OpStack opStack;

  @BeforeEach
  public void setup() {
    opStack = new OpStack();
  }


  @Test
  void createIsEmpty() {
    assertEquals(opStack.isEmpty(), true, "Tests to see if the newly created stack is empty.");
  }

  @Test
  // Adds a push methods which can be used to add items to the newly created array.
  void addItemsToStack() {
    Symbol Symbols = Symbol.PLUS;
    opStack.push(Symbols);
    Symbols = Symbol.INVAILD;
    opStack.push(Symbols);
    Symbols = Symbol.MINUS;
    opStack.push(Symbols);
  }

  @Test
  void getMultipleItemsFromStack() throws EmptyStack {
    Symbol Symbols = Symbol.PLUS;
    opStack.push(Symbols);
    Symbols = Symbol.INVAILD;
    opStack.push(Symbols);
    Symbols = Symbol.MINUS;
    opStack.push(Symbols);
    assertEquals(opStack.pop(), Symbol.MINUS, "Checks both push and pop are working correctly.");
    assertEquals(opStack.pop(), Symbol.INVAILD, "Checks both push and pop are working correctly.");
    assertEquals(opStack.pop(), Symbol.PLUS, "Checks both push and pop are working correctly.");
  }
}
