package calculator.uk.mrinterbugs;

/**
 * Used to start the application.
 * @author Student
 *
 */
public class SuperStarter {
  
  /**
   * Used to start the application.
   * @param args any arguements to pass.
   */
  public static void main(String[] args) {
    try {
      Starter.main(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
