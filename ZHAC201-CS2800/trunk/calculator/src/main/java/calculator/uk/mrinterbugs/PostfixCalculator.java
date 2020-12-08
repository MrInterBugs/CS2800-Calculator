package calculator.uk.mrinterbugs;

import java.util.Scanner;

/**
 * Used to do postfix on a user inputted string.
 * https://www.geeksforgeeks.org/stack-set-4-evaluation-postfix-expression/
 * 
 * @author Student
 *
 */
public class PostfixCalculator implements Calculator {
  private static final NumStack numstack = new NumStack();

  /**
   * Used to calculate the result.
   * 
   * @param arguments the calculation to be made.
   * @return the answer.
   * @throws UserInput if it is not a valid input.
   * @throws EmptyStack If the stack is empty.
   */
  public static float evaluate(String arguments) throws UserInput, EmptyStack {
    float argument1;
    float argument2;
    Scanner scan = new Scanner(arguments);
    while (scan.hasNext()) {
      if (scan.hasNextFloat()) {
        numstack.push(scan.nextFloat());
      } else {
        String symbol = scan.next();
        argument1 = numstack.pop();
        argument2 = numstack.pop();
        switch (symbol) {
          case "+":
            numstack.push(argument2 + argument1);
            break;
          case "-":
            numstack.push(argument2 - argument1);
            break;
          case "/":
            numstack.push(argument2 / argument1);
            break;
          case "*":
            numstack.push(argument2 * argument1);
            break;
          case "^":
            numstack.push((float) Math.pow(argument2, argument1));
            break;
          default:
            throw new UserInput("This is not a valid input.");
        }
      }
    }
    scan.close();
    return numstack.pop();
  }
}