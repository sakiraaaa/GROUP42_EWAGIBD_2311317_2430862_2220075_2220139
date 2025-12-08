module com.example.group42_ewagibd_2311317_2430862_2220075_2220139 {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.group42_ewagibd_2311317_2430862_2220075_2220139 to javafx.fxml;
    opens com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira to javafx.fxml;
    opens com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Mashrifa to javafx.fxml;


    exports com.example.group42_ewagibd_2311317_2430862_2220075_2220139;
    exports com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Sakira;
    exports com.example.group42_ewagibd_2311317_2430862_2220075_2220139.Mashrifa;
}