package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testStack {

  private Stack stack; // Automatically adds this class using eclipse.

  @BeforeEach
  public void setup() {
    stack = new Stack();
  }

  // No longer passable.
  @Test
  void createSize() {
    assertEquals(stack.getSize(), 0, "Tests the size of the stack");
  }

  // No longer passable.
  @Test
  void createListandReturn() {
    assertEquals(stack.pop(), null,
        "Used to make the pop method and the array that is used to populate it.");
  }

  @Test
  // Adds a push methods which can be used to add items to the newly created array.
  void addItemsToStack() {
    Float number = (float) 1.0;
    Entry entry = new Entry(number);
    stack.push(entry);
    number = (float) 7.3;
    entry = new Entry(number);
    stack.push(entry);
    number = (float) 13.1;
    entry = new Entry(number);
    stack.push(entry);
  }

  @Test
  void getMultipleItemsFromStack() {
    Float number = (float) 1.0;
    Entry entry = new Entry(number);
    stack.push(entry);
    number = (float) 7.3;
    entry = new Entry(number);
    stack.push(entry);
    number = (float) 13.1;
    entry = new Entry(number);
    stack.push(entry);
    assertEquals(stack.pop().getNumber(), (float) 13.1, "Checks both push and pop are working correctly.");
    assertEquals(stack.pop().getNumber(), (float) 7.3, "Checks both push and pop are working correctly.");
    assertEquals(stack.pop().getNumber(), (float) 1.0, "Checks both push and pop are working correctly.");
  }

  @Test
  void addTop() {
    Float number = (float) 1.0;
    Entry entry = new Entry(number);
    stack.push(entry);
    number = (float) 7.3;
    entry = new Entry(number);
    stack.push(entry);
    number = (float) 13.1;
    entry = new Entry(number);
    stack.push(entry);
    assertEquals(stack.top().getNumber(), (float) 13.1,
        "creates and checks the top method to return the last added item.");
    stack.pop();
    stack.pop();
    assertEquals(stack.top().getNumber(), (float) 1.0, "Check top outputs the correct int after maninulating the stack.");
  }

  @Test
  void addException() {
    assertEquals(stack.top(), null, "Checks that the method returns null if the stack is empty.");
    assertEquals(stack.pop(), null, "Checks that the method returns null if the stack is empty.");
  }

}
