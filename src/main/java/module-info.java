module org.myproject.aplikasitiketbioskop {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.myproject.aplikasitiketbioskop to javafx.fxml;
    exports org.myproject.aplikasitiketbioskop;
}