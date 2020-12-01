package calculator.uk.mrinterbugs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Controller class for my javaFX code.
 * 
 * @author Student
 *
 */
public class MyController {

  @FXML // ResourceBundle that was given to the FXMLLoader
  private ResourceBundle resources;

  @FXML // URL location of the FXML file that was given to the FXMLLoader
  private URL location;

  @FXML //The textfield used to get an input
  private TextField textfield;

  @FXML //Tells the user which version of the program is being used.
  void aboutProgram(ActionEvent event) {
    System.out.println("Button clicked");
  }

  @FXML //Gets and returns the answer to the user.
  void getInput(ActionEvent event) {
    Integer value1 = Integer.valueOf(textfield.getText());
    Integer r = value1 + 5;
    textfield.setText(r.toString());
  }

  @FXML // This method is called by the FXMLLoader when initialization is complete
  void initialize() {
    System.out.println("Initialized JavafxController");
  }
}

