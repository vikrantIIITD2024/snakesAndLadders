import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

public class afterNext {
    App a = new App();
    @FXML
    private Button ctsbb;

    @FXML
    private Circle hari_gotti;

    @FXML
    private Circle nilli_gotti;

    @FXML
    private TextField p1;

    @FXML
    private TextField p2;

    @FXML
    void changeToSnakeBoard(ActionEvent event) throws IOException {
        a.changeScene("Board.fxml");
    }

}



