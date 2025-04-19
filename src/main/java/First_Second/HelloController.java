package First_Second;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField left;
    @FXML
    private TextField right;
    @FXML
    private Button arrow_baton;
    @FXML
    private CheckBox left_check;
    @FXML
    private CheckBox right_check;
    @FXML
    private CheckBox arrow_check;
    @FXML
    public void initialize(){
        left_check.selectedProperty().addListener((obs,oldVal,newVal)->{
            left.setVisible(newVal);
        });
        right_check.selectedProperty().addListener((obs,oldVal,newVal)->{
            right.setVisible(newVal);
        });
        arrow_check.selectedProperty().addListener((obs,oldVal,newVal)->{
            arrow_baton.setVisible(newVal);
        });
    }

    private boolean isRight = true;
    public void clickArrow (){
        String leftText = left.getText();
        String rightText = right.getText();

        if (isRight){
            arrow_baton.setText("<-");
            right.setText(leftText);
            left.setText("");
        }
        else{
            arrow_baton.setText("->");
            left.setText(rightText);
            right.setText("");
        }
        isRight = !isRight;
        right.setDisable(isRight);
        left.setDisable(!isRight);
    }
}