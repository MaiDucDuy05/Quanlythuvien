module com.example.projectlibrari {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.dlsc.formsfx;
    requires javafx.media;
    requires java.desktop;

    opens com.example.projectlibrari to javafx.fxml;
    exports com.example.projectlibrari;
}