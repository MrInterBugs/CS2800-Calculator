package calculator.uk.mrinterbugs;

/**
 * This is the exception which can be thrown if a stack is empty and an operation is called on it.
 * 
 * @author Student
 *
 */
public class UserInput extends Exception {

  /**
   * SerialVersionUID is used to ensure that during deserialization the same class (that was used
   * during serialize process) is loaded. https://www.geeksforgeeks.org/serialversionuid-in-java/
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * Simple constructor that can be used to get the message from the exception.
   * 
   * @param message Returns a description of the exception.
   */
  public UserInput(String message) {
    super(message);
  }
}
