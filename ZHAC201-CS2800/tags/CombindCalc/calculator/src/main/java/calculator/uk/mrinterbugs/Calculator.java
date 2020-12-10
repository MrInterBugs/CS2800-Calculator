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
   * @param arguements get the answer to the user inputed question.
   * @return the correct answer.
   * @throws UserInput If the userinput is not valid throw and exception.
   */
  static float evaluate(String arguements) throws UserInput {
    return 0;
  }
}
