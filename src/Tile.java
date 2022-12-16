import javafx.scene.shape.Rectangle;

class Tile extends Rectangle {
    double xp, yp;
    boolean odd;
    
    public Tile(double d, double e, boolean odd){
        xp = e;
        yp = d;
        this.odd = odd;
        
    }

   
}
