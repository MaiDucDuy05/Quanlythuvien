package com.example.projectlibrari;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Tạo nhãn
        Label label = new Label("Chào mừng bạn đến với JavaFX!");

        // Tạo nút
        Button button = new Button("Nhấn vào đây");
        button.setOnAction(e -> label.setText("Bạn đã nhấn nút!"));

        // Tạo bố cục
        VBox vbox = new VBox(10, label, button);
        vbox.setPrefSize(300, 200);

        // Tạo cảnh
        Scene scene = new Scene(vbox);

        // Thiết lập cửa sổ
        primaryStage.setTitle("Ứng dụng JavaFX Đơn Giản");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
