module org.example.desafioconta {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.desafioconta to javafx.fxml;
    exports org.example.desafioconta;
}