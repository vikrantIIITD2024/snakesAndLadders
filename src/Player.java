import java.io.IOException;

import javafx.scene.shape.Circle;

public class Player {
    int id;
    App all = new App();
    double x=22.25,y = 420;
    boolean turn;
    boolean start = false;
    

    Circle gotti;
    boolean odd = true;
    public Player(boolean turn, Circle circle, int id)
    {
        this.turn = turn ;
        this.gotti = circle;
        this.id = id;
        
    }
    public void one_move()
    {
        if(x<44.5 && y<=44.5 && x>0 && y>0){
            try {
                if(id ==0){
                all.changeScene("won.fxml");//blue win
                }else{
                    all.changeScene("won_green.fxml");
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } 

        if((x < 445 && x >400 && odd == true)){
            gotti.setLayoutY(y -= 44.5);
          
            odd = false;

        }
        
        
        else if((x<44.5 && x>0 && odd==false)){
            gotti.setLayoutY(y -= 44.5);
         
            odd = true;
        }
        else if(odd){
            gotti.setLayoutX(x += 44.5);
            

        }
        else {
            gotti.setLayoutX(x -= 44.5);

        }
        
    }

    
    public void move_player(Dice d, Snake s, Ladders l){
        
        for(int f = 0; f<d.dice_number;f++)
        {
            one_move();  //1
        }
        for(int i = 0;i<6; i++ ){
            if(x >= s.snake.get(i).xp && x <= (44.5 + s.snake.get(i).xp) && (y >= s.snake.get(i).yp && y <= (44.5+ s.snake.get(i).yp)))
            {
                x = s.snakebites.get(i).xp+22.25;
                y = s.snakebites.get(i).yp+22.25;
                gotti.setLayoutX(s.snakebites.get(i).xp+22.25);
                gotti.setLayoutY(s.snakebites.get(i).yp+22.25);
                odd = s.snakebites.get(i).odd;
       
                


            }else if (x >= l.ladder.get(i).xp && x <= (44.5 + l.ladder.get(i).xp) && y >= l.ladder.get(i).yp && y <= (44.5+ l.ladder.get(i).yp))
            {
                x = l.ladderClimbed.get(i).xp+22.25;
                y = l.ladderClimbed.get(i).yp+22.25;
                gotti.setLayoutX(l.ladderClimbed.get(i).xp+22.25);
                gotti.setLayoutY(l.ladderClimbed.get(i).yp+22.25);
                odd = l.ladderClimbed.get(i).odd;

            }
        }
        

        
    }
    
}

