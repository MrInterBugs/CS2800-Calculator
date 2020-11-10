package calculator.uk.mrinterbugs;

/**
 * A simple stack class used to store a customisable array integers.
 * 
 * @author Student
 *
 */
public class Stack {

  private int size;
  private int[] stack = new int[1000];

  /**
   * Used to get the size of the full stack.
   *
   * @return current size of stack.
   */
  public Integer getSize() {
    return size;
  }

  /**
   * This method can be called to get the value at the top of the stack.
   * 
   * @return The int at the top of the stack.
   */
  public Integer pop() {
    try {
      size = size - 1;
      return stack[size];
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("The stack is empty");
      return null;
    }
  }

  /**
   * This method is used to store a new value at the top of the stack.
   * 
   * @param i The int that needs to be stored in the stack.
   */
  public void push(int i) {
    stack[size] = i;
    size = size + 1;
  }

  /**
   * Returns and keeps the newest entry.
   * 
   * @return The newest int to be added.
   */
  public Integer top() {
    try {
      return stack[size - 1];
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("The stack is empty");
      return null;
    }
  }

}
