package calculator.uk.mrinterbugs;

/**
 * An extension of the stack class for storing integers.
 * 
 * @author Student
 *
 */
public class StrStack {


  private Stack stack;
  /**
   * Creates a new stack which can be used.
   */
  public StrStack() {
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
   * @return The Entry at the top of the stack.
   * @throws EmptyStack The empty stack exception is thrown if no item in the stack is found.
   */
  public String pop() throws EmptyStack {
    if (this.stack.getSize() == 0) {
      throw new EmptyStack("The stack is empty");
    } else {
      return stack.pop().getStr();
    }
  }

  /**
   * This method is used to store a new value at the top of the stack.
   * 
   * @param i The Entry that needs to be stored in the stack.
   */
  public void push(String i) {
    Entry entry = new Entry(i);
    this.stack.push(entry);;
  }

}
