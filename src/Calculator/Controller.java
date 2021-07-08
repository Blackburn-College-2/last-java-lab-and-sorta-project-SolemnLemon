package Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private Label lblCount;

    @FXML
    private TextField txtBoxInput;

     @FXML
     void enter(ActionEvent event){
     String s=txtBoxInput.getAccessibleText();
         System.out.println(s);
     }
    @FXML
    
    private Button btnCalculate;
    @FXML
    void clicked(ActionEvent event) {
        System.out.println("I'm hit!");
        lblCount.setText("" + (++counter));
    }
    
    
    private int counter = 0;
    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
    }
}
