import java.io.File;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dice {
    int dice_number;
    ImageView di;
    public Dice(ImageView di){
        this.di = di;
    }
    public int getDice ()
    
    {
        

        dice_number=(int)(Math.random()*6+1);
        File file = new File("/Users/vikrantdhanwadia/Desktop/Java Project/firstjavapro/src/dice_face_" + dice_number + ".png");
        di.setImage(new Image(file.toURI().toString()));
        return dice_number;   
    }

}
