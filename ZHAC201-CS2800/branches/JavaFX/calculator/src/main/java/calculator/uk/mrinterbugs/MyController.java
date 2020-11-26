package calculator.uk.mrinterbugs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;

/**
 * belh.
 * 
 * @author Student
 *
 */
public class MyController {

  @FXML // ResourceBundle that was given to the FXMLLoader
  private ResourceBundle resources;

  @FXML // URL location of the FXML file that was given to the FXMLLoader
  private URL location;

  @FXML
  void aboutProgram(Event event) {
    System.out.println("Button clicked");
  }

  @FXML
  void getInput(Event event) {
    System.out.println("Button clicked 2");
  }

  @FXML // This method is called by the FXMLLoader when initialization is complete
  void initialize() {
    System.out.println("Initialized JavafxController");
  }

}

