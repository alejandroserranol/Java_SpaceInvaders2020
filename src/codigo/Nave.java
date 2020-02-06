package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Alejandro Serrano
 */
public class Nave {
    
    Image imagen = null;    
    public int posX = 0;
    public int posY = 0;
    
    public Nave(){
        try{
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        }
        catch(IOException e) {      
        }
    }
    
}
