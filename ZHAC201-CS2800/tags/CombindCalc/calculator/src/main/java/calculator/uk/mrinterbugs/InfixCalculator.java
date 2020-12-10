package calculator.uk.mrinterbugs;

import java.util.Scanner;

/**
 * Used to convert inifix to postfix.
 * https://slaystudy.com/infix-to-postfix/
 * 
 * @author Student
 *
 */
public class InfixCalculator implements Calculator {

  /**
   * The evalute method calls postfix to caluclate the infix method.
   * 
   * @param arguements The question the user has asked.
   * @return The answer.
   * @throws UserInput If it is not valid.
   * @throws EmptyStack If the stack is empty.
   */
  public static float evaluate(String arguements) throws UserInput, EmptyStack {
    String postfixArguement = "";
    arguements = "( " + arguements + " )";
    Scanner scan = new Scanner(arguements);
    OpStack opstack = new OpStack();

    while (scan.hasNext()) {
      String c = scan.next();
      if (c.equals(Symbol.LEFT_BRACKET.getSymbol())) {
        opstack.push(Symbol.LEFT_BRACKET);
      } else if (isInteger(c)) {
        postfixArguement = postfixArguement + c + " ";
      } else if (isSymbol(c)) {
        while (isSymbol(opstack.top().getSymbol())
            && impotance(opstack.top().getSymbol()) >= impotance(c)) {
          postfixArguement = postfixArguement + opstack.pop().getSymbol() + " ";
        }
        if (c.equals(Symbol.PLUS.getSymbol())) {
          opstack.push(Symbol.PLUS);
        } else if (c.equals(Symbol.MINUS.getSymbol())) {
          opstack.push(Symbol.MINUS);
        } else if (c.equals(Symbol.DIVIDE.getSymbol())) {
          opstack.push(Symbol.DIVIDE);
        } else if (c.equals(Symbol.TIMES.getSymbol())) {
          opstack.push(Symbol.TIMES);
        }
      } else if (c.equals(Symbol.RIGHT_BRACKET.getSymbol())) {
        while (opstack.top() != Symbol.LEFT_BRACKET) {
          postfixArguement = postfixArguement + opstack.pop().getSymbol() + " ";
        }
        opstack.pop();
      }
    }
    scan.close();
    return (PostfixCalculator.evaluate(postfixArguement));
  }

  private static int impotance(String c) {
    if (c.equals(Symbol.PLUS.getSymbol()) || c.equals(Symbol.MINUS.getSymbol())) {
      return 1;
    }
    if (c.equals(Symbol.DIVIDE.getSymbol()) || c.equals(Symbol.TIMES.getSymbol())) {
      return 2;
    }
    return 0;
  }

  private static boolean isSymbol(String c) {
    if (c.equals(Symbol.PLUS.getSymbol()) || c.equals(Symbol.MINUS.getSymbol())
        || c.equals(Symbol.DIVIDE.getSymbol()) || c.equals(Symbol.TIMES.getSymbol())) {
      return true;
    } else {
      return false;
    }
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
