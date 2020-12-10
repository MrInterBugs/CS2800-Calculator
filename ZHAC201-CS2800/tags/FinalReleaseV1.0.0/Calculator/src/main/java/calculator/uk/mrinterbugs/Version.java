package calculator.uk.mrinterbugs;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * Used to show the version info.
 * 
 * @author Student
 *
 */
public class Version {

  /**
   * Used to create the pop up window.
   * 
   */
  public static void display() {
    
    String version = "1.0.0";
    
    Stage versioning = new Stage();

    versioning.setTitle("Version Info");

    Label label0 = new Label("Postfix Calculator");
    Label label1 = new Label("Running version " + version);
    Label label2 = new Label("Created by Aedan Lawrence");
    Label label3 = new Label("ZHAC201@live.rhul.ac.uk");
    VBox layout = new VBox();
    layout.getChildren().addAll(label0, label1, label2, label3);

    Scene scene1 = new Scene(layout, 150, 67);
    versioning.setScene(scene1);
    versioning.showAndWait();

  }

}
