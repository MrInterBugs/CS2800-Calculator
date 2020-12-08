package calculator.uk.mrinterbugs;

/**
 * Used to make sure each calculator returns the same format of answer.
 * 
 * @author Student
 *
 */
public interface Calculator {
  
  /**
   * Used to make sure each calculator returns the same format of answer.
   * 
   * @param arguments get the answer to the user inputted question.
   * @return the correct answer.
   * @throws UserInput If the user input is not valid throw and exception.
   */
  static float evaluate(String arguments) throws UserInput {
    return 0;
  }
}
