package calculator.uk.mrinterbugs;

import java.util.Scanner;

/**
 * Used to do postfix on a userinputed string.
 * https://www.geeksforgeeks.org/stack-set-4-evaluation-postfix-expression/
 * 
 * @author Student
 *
 */
public class PostfixCalculator implements Calculator {
  private static NumStack numstack = new NumStack();

  /**
   * Used to calculate the result.
   * 
   * @param arguements the calculation to be made.
   * @return the answer.
   * @throws UserInput if it is not a valid input.
   * @throws EmptyStack If the stack is empty.
   */
  public static float evaluate(String arguements) throws UserInput, EmptyStack {
    float arguement1;
    float arguement2;
    Scanner scan = new Scanner(arguements);
    while (scan.hasNext()) {
      if (scan.hasNextFloat()) {
        numstack.push(scan.nextFloat());
      } else {
        String symbol = scan.next();
        arguement1 = numstack.pop();
        arguement2 = numstack.pop();
        switch (symbol) {
          case "+":
            numstack.push(arguement2 + arguement1);
            break;
          case "-":
            numstack.push(arguement2 - arguement1);
            break;
          case "/":
            numstack.push(arguement2 / arguement1);
            break;
          case "*":
            numstack.push(arguement2 * arguement1);
            break;
          default:
            break;
        }
      }
    }
    scan.close();
    return numstack.pop();
  }
}