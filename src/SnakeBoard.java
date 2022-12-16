
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class SnakeBoard {
    App appl = new App();

    @FXML
    ImageView Dice;

    Dice d;

    Player p1;

    Player p2;

    Snake cobra;

    Ladders ladd;
    
    Player p;

    @FXML
    private Button diceRoll;

    @FXML
    private Circle nilli_gotti;
    
    @FXML
    private Circle hari_gotti;
 

    public void initialize()
    {
        System.out.println("");
        System.out.println("LOL");
        System.out.println("");
        ArrayList <Tile> list = new ArrayList<>();
        for(int i =0 ; i<10; i++){
            for(int j = 0 ; j<10; j++){
                list.add(new Tile(i*44.5,j*44.5, (i%2 == 1)));
            }
        } 
        d = new Dice(Dice);
        p1 = new Player(true,nilli_gotti,0);
        p2 = new Player(false, hari_gotti,1);
        

        cobra = new Snake(list);
        ladd = new Ladders(list);
        
    }

    @FXML
    public void alternating_move(ActionEvent event)

    {
            
       
        
        if (d.getDice() == 1 && p1.turn == true && p1.start==false )
        {
            
            System.out.println("");
            System.out.println("Dice Number: "+d.dice_number);
            System.out.println("");
            nilli_gotti.setLayoutX(22.25);
            nilli_gotti.setLayoutY(420);
            p1.start = true;
            
            
        }else if (d.getDice() == 1 && p2.turn == true && p2.start==false){
            System.out.println("");
            System.out.println("Dice Number: "+d.dice_number);
            System.out.println("");
            hari_gotti.setLayoutX(22.25);
            hari_gotti.setLayoutY(420);
            p2.start = true;
           
            
        }

        else if(p1.start == true && p1.turn == true){
            System.out.println("");
            System.out.println("Dice Number: "+d.dice_number);
            System.out.println("");
            
            p1.move_player(d, cobra, ladd);
            
        }
        else if(p2.start == true && p2.turn == true){
            System.out.println("");
            System.out.println("Dice Number: "+d.dice_number);
            System.out.println("");
           
            p2.move_player(d, cobra, ladd);
            
        }
        p1.turn = !p1.turn;
        p2.turn = !p2.turn;
    }

}
class Snake{

    ArrayList<Tile> snake = new ArrayList<>();
    ArrayList<Tile> snakebites = new ArrayList<>();
    Snake(ArrayList<Tile> t){
        snake.add(t.get(4));
        snake.add(t.get(6));
        snake.add(t.get(25));
        snake.add(t.get(56));
        snake.add(t.get(63));
        snake.add(t.get(77));
        snakebites.add(t.get(51));
        snakebites.add(t.get(29));
        snakebites.add(t.get(68));
        snakebites.add(t.get(84));
        snakebites.add(t.get(92));
        snakebites.add(t.get(99));
    
    }
}
class Ladders{
    ArrayList<Tile> ladder = new ArrayList<>();
    ArrayList<Tile> ladderClimbed = new ArrayList<>();
    Ladders(ArrayList<Tile> t){
        ladder.add(t.get(93)); //from 4
        ladder.add(t.get(88)); //from 
        ladder.add(t.get(86));
        ladder.add(t.get(71));
        ladder.add(t.get(50));
        ladder.add(t.get(46));
        ladderClimbed.add(t.get(44)); // to 56
        ladderClimbed.add(t.get(59));
        ladderClimbed.add(t.get(45));
        ladderClimbed.add(t.get(42));
        ladderClimbed.add(t.get(21));
        ladderClimbed.add(t.get(17));
        
    }
}
