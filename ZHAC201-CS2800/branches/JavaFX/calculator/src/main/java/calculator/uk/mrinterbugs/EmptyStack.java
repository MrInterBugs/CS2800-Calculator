package calculator.uk.mrinterbugs;

/**
 * This is the exception which can be thrown if a stack is empty and an operation is called on it.
 * 
 * @author Student
 *
 */
public class EmptyStack extends Exception {
  
  /**
   * Simple constructor that can be used to get the message from the exception.
   * 
   * @param message Returns a description  of the exception.
   */
  public EmptyStack(String message) {
    super(message);
  }
}
