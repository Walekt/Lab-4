package Fourth;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField number1Field;

    @FXML
    private TextField number2Field;

    @FXML
    private Label resultLabel;

    @FXML
    private Button addButton, subtractButton, multiplyButton, divideButton;

    @FXML
    protected void add() {
        double[] numbers = parseInput();
        if (numbers != null) {
            double result = numbers[0] + numbers[1];
            resultLabel.setText("Результат: " + result);
        }
    }

    @FXML
    protected void subtract() {
        double[] numbers = parseInput();
        if (numbers != null) {
            double result = numbers[0] - numbers[1];
            resultLabel.setText("Результат: " + result);
        }
    }

    @FXML
    protected void multiply() {
        double[] numbers = parseInput();
        if (numbers != null) {
            double result = numbers[0] * numbers[1];
            resultLabel.setText("Результат: " + result);
        }
    }

    @FXML
    protected void divide() {
        double[] numbers = parseInput();
        if (numbers != null) {
            if (numbers[1] == 0) {
                showError("Деление на ноль невозможно!");
            } else {
                double result = numbers[0] / numbers[1];
                resultLabel.setText("Результат: " + result);
            }
        }
    }

    private double[] parseInput() {
        try {
            double num1 = Double.parseDouble(number1Field.getText());
            double num2 = Double.parseDouble(number2Field.getText());
            return new double[]{num1, num2};
        } catch (NumberFormatException e) {
            showError("Ошибка ввода! Введите корректные числа.");
            return null;
        }
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Ошибка");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}