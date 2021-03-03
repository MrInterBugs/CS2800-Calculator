package calculator.uk.mrinterbugs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
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

  @FXML // URL location of the FXML file that was given to the FXMLLoader.
  private URL location;

  @FXML // The text field used to get an input.
  private TextField textfield;

  @FXML // The checkbox used to select which calculation method to use.
  private CheckBox infix;

  @FXML // Tells the user which version of the program is being used.
  void aboutProgram(ActionEvent event) {
    Version.display();
  }

  @FXML // Gets and returns the answer to the user.
  private void getInput(ActionEvent event) throws UserInput {
    String test = textfield.getText();
    Float result = null;
    if (infix.isSelected()) {
      try {
        result = InfixCalculator.evaluate(test);
        textfield.setText(result.toString());
      } catch (UserInput | EmptyStack e) {
        textfield.setText("Not a valid input.");
      }
    } else {
      try {
        result = PostfixCalculator.evaluate(test);
        textfield.setText(result.toString());
      } catch (UserInput | EmptyStack e) {
        textfield.setText("Not a valid input.");
      }
    }
  }

  @FXML // This method is called by the FXMLLoader when initialisation is complete
  void initialize() {
  }
}

