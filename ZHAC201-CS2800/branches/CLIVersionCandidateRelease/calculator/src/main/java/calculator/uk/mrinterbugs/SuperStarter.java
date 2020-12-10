package calculator.uk.mrinterbugs;

import java.util.Scanner;

/**
 * Used to start the application.
 * 
 * @author Student
 *
 */
public class SuperStarter {

  /**
   * Used to start the application in either GUI or CLI version.
   * 
   * @param args Any arguments that should be passed in.
   * @throws EmptyStack If the stack is empty.
   * @throws UserInput If the user input is not valid.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = 0;
    String input;
    while (i == 0) {
      System.out.println("press 1 for GUI version or 2 for CLI version: ");
      i = scan.nextInt();
    }
    if (i == 1) {
      try {
        Starter.main(args);
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      i = 0;
      while (i == 0) {
        System.out.println("press 1 for postfix version or 2 for infix version: ");
        i = scan.nextInt();
        scan.nextLine();
      }
      if (i == 1) {
        while (true) {
          System.out.println("Enter calculation (type exit to quit): ");
          input = scan.nextLine();
          if (input.equals("exit")) {
            System.exit(0);
          }
          try {
            System.out.println("Result = " + PostfixCalculator.evaluate(input));
          } catch (UserInput | EmptyStack e) {
            System.out.println("This was not a valid input.");
          }
        }
      } else {
        while (true) {
          System.out.println("Enter calculation (type exit to quit): ");
          input = scan.nextLine();
          if (input.equals("exit")) {
            System.exit(0);
          }
          try {
            System.out.println("Result = " + InfixCalculator.evaluate(input));
          } catch (UserInput | EmptyStack e) {
            System.out.println("This was not a valid input.");
          }
        }
      }
    }
    scan.close();
  }
}
