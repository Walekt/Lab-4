package Fifth;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FlagApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FlagApplication.class.getResource("flag_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 200);
        stage.setTitle("Текстовый флаг");
        stage.setScene(scene);
        stage.setResizable(false); // Запрещаем изменение размера окна
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

