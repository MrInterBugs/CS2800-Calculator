package calculator.uk.mrinterbugs;

/**
 * An extension of the stack class for storing symbols.
 * 
 * @author Student
 *
 */
public class OpStack {


  private Stack stack;

  /**
   * Creates a new stack which can be used.
   */
  public OpStack() {
    this.stack = new Stack();
  }

  /**
   * Checks to see if the stack is empty.
   * 
   * @return true if empty or false otherwise.
   */
  public boolean isEmpty() {
    if (this.stack.getSize() == 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * This method can be called to get the value at the top of the stack.
   * 
   * @return The symbol at the top of the stack.
   * @throws EmptyStack The empty stack exception is thrown if no item in the stack is found.
   */
  public Symbol pop() throws EmptyStack {
    if (this.stack.getSize() == 0) {
      throw new EmptyStack("The stack is empty");
    } else {
      return stack.pop().getOther();
    }
  }

  /**
   * This method is used to store a new value at the top of the stack.
   * 
   * @param i The symbol that needs to be stored in the stack.
   */
  public void push(Symbol i) {
    Entry entry = new Entry(i);
    this.stack.push(entry);
  }

  /**
   * Used to get the value at the top of the stack.
   * 
   * @return the top value.
   * @throws EmptyStack If the stack is empty.
   */
  public Symbol top() throws EmptyStack {
    return stack.top().getOther();
  }

}
