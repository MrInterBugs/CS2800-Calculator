package calculator.uk.mrinterbugs;

//https://github.com/jjenkov/javafx-examples Used to understand how to use JavaFX as i had issues with file locations on windows.
import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * The main class of the program which is run to get everything started.
 * .
 * @author Student
 *
 */
public class Starter extends Application {

  /**
   * Start the program.
   * @param args Used to pass args when running.
   * @throws Exception If it can't be launched throws an exception.
   */
  public static void main(String[] args) throws Exception {
    launch(args);
  }

  /**
   * Used to start the javaFX application/window.
   *
   */
  public void start(Stage stage) throws Exception {

    FXMLLoader loader = new FXMLLoader();
    
    MyController controller = new MyController();
    loader.setController(controller);
    File fxmlFile = new File("src/main/resources/fxml/CalcWindow.fxml");
    URL fxmlUrl = fxmlFile.toURI().toURL();
    loader.setLocation(fxmlUrl);


    VBox vbox = loader.<VBox>load();

    Scene scene = new Scene(vbox);
    stage.setScene(scene);
    stage.show();
  }
}
