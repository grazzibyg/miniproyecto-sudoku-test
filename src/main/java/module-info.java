module com.example.miniproyectosudokutest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miniproyectosudokutest to javafx.fxml;
    exports com.example.miniproyectosudokutest;
}