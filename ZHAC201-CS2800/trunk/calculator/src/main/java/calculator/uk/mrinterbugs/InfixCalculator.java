package calculator.uk.mrinterbugs;

import java.util.Scanner;

/**
 * Used to convert infix to postfix. 
 * Based of off this C++ example https://slaystudy.com/infix-to-postfix/
 * 
 * @author Student
 *
 */
public class InfixCalculator implements Calculator {

  /**
   * The evaluate method calls postfix to calculate the infix method.
   * 
   * @param arguments The question the user has asked.
   * @return The answer.
   * @throws UserInput If it is not valid.
   * @throws EmptyStack If the stack is empty.
   */
  public static float evaluate(String arguments) throws UserInput, EmptyStack {
    StringBuilder postfixArgument = new StringBuilder();
    arguments = "( " + arguments + " )";
    Scanner scan = new Scanner(arguments);
    OpStack opstack = new OpStack();

    while (scan.hasNext()) {
      String c = scan.next();
      if (c.equals(Symbol.LEFT_BRACKET.getSymbol())) {
        opstack.push(Symbol.LEFT_BRACKET);
      } else if (isInteger(c)) {
        postfixArgument.append(c).append(" ");
      } else if (isSymbol(c)) {
        while (isSymbol(opstack.top().getSymbol())
            && importance(opstack.top().getSymbol()) >= importance(c)) {
          postfixArgument.append(opstack.pop().getSymbol()).append(" ");
        }
        if (c.equals(Symbol.PLUS.getSymbol())) {
          opstack.push(Symbol.PLUS);
        } else if (c.equals(Symbol.MINUS.getSymbol())) {
          opstack.push(Symbol.MINUS);
        } else if (c.equals(Symbol.DIVIDE.getSymbol())) {
          opstack.push(Symbol.DIVIDE);
        } else if (c.equals(Symbol.TIMES.getSymbol())) {
          opstack.push(Symbol.TIMES);
        } else if (c.equals(Symbol.POWER.getSymbol())) {
          opstack.push(Symbol.POWER);
        }
      } else if (c.equals(Symbol.RIGHT_BRACKET.getSymbol())) {
        while (opstack.top() != Symbol.LEFT_BRACKET) {
          postfixArgument.append(opstack.pop().getSymbol()).append(" ");
        }
        opstack.pop();
      }
    }
    scan.close();
    return (PostfixCalculator.evaluate(postfixArgument.toString()));
  }

  private static int importance(String c) {
    if (c.equals(Symbol.PLUS.getSymbol()) || c.equals(Symbol.MINUS.getSymbol())) {
      return 1;
    }
    if (c.equals(Symbol.DIVIDE.getSymbol()) || c.equals(Symbol.TIMES.getSymbol())
        || c.equals(Symbol.POWER.getSymbol())) {
      return 2;
    }
    return 0;
  }

  private static boolean isSymbol(String c) {
    return c.equals(Symbol.PLUS.getSymbol()) || c.equals(Symbol.MINUS.getSymbol())
            || c.equals(Symbol.DIVIDE.getSymbol()) || c.equals(Symbol.TIMES.getSymbol())
            || c.equals(Symbol.POWER.getSymbol());
  }

  /**
   * Tests to see if an string is an integer.
   * https://learn-java-by-example.com/java/check-java-string-integer/
   * 
   * @param c The string to be tested.
   * @return True or false weather or not it is a int.
   */
  public static boolean isInteger(String c) {
    try {
      Integer.parseInt(c);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}