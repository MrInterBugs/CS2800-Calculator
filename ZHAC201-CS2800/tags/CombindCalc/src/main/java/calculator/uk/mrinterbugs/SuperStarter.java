package calculator.uk.mrinterbugs;

/**
 * Used to start the application.
 * @author Student
 *
 */
public class SuperStarter {
  
  /**
   * Used to start the application.
   * @param args Any arguments that should be passed in.
   */
  public static void main(String[] args) {
    try {
      Starter.main(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
