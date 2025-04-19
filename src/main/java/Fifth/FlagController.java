package Fifth;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FlagController {
    // Группы для полос флага
    @FXML private ToggleGroup stripe1Group;
    @FXML private ToggleGroup stripe2Group;
    @FXML private ToggleGroup stripe3Group;

    // RadioButton для первой полосы
    @FXML private RadioButton red1, green1, blue1, white1, black1;

    // RadioButton для второй полосы
    @FXML private RadioButton red2, green2, blue2, white2, black2;

    // RadioButton для третьей полосы
    @FXML private RadioButton red3, green3, blue3, white3, black3;

    @FXML
    private void initialize() {
        // Инициализация групп (важно делать это здесь, а не в FXML)
        stripe1Group = new ToggleGroup();
        stripe2Group = new ToggleGroup();
        stripe3Group = new ToggleGroup();

        // Назначение групп кнопкам
        setToggleGroups();

        // Выбор кнопок по умолчанию
        red1.setSelected(true);
        green2.setSelected(true);
        blue3.setSelected(true);
    }

    private void setToggleGroups() {
        red1.setToggleGroup(stripe1Group);
        green1.setToggleGroup(stripe1Group);
        blue1.setToggleGroup(stripe1Group);
        white1.setToggleGroup(stripe1Group);
        black1.setToggleGroup(stripe1Group);

        red2.setToggleGroup(stripe2Group);
        green2.setToggleGroup(stripe2Group);
        blue2.setToggleGroup(stripe2Group);
        white2.setToggleGroup(stripe2Group);
        black2.setToggleGroup(stripe2Group);

        red3.setToggleGroup(stripe3Group);
        green3.setToggleGroup(stripe3Group);
        blue3.setToggleGroup(stripe3Group);
        white3.setToggleGroup(stripe3Group);
        black3.setToggleGroup(stripe3Group);
    }

    @FXML
    private void drawFlag() {
        try {
            String stripe1 = getSelectedColor(stripe1Group);
            String stripe2 = getSelectedColor(stripe2Group);
            String stripe3 = getSelectedColor(stripe3Group);

            String flagDescription = String.format("Флаг: %s, %s, %s", stripe1, stripe2, stripe3);
            showAlert("Ваш флаг", flagDescription);
        } catch (Exception e) {
            showAlert("Ошибка", "Пожалуйста, выберите цвета для всех полос!");
        }
    }

    private String getSelectedColor(ToggleGroup group) {
        RadioButton selected = (RadioButton) group.getSelectedToggle();
        return selected.getText();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}