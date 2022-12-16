import javafx.fxml.FXML;
import javafx.scene.control.Button;


import java.io.IOException;


import javafx.event.ActionEvent;



public class maincontroller {
    App a = new App();

    @FXML
    private Button select;

    @FXML
    public void selectplayername(ActionEvent event) throws IOException {
        selectplayer();
    }
    private void selectplayer() throws IOException{
        
        a.changeScene("afterstart.fxml");
    }
}
