package codigo;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Alejandro Serrano
 */
public class Explosion {
    Image imagenExplosion0 = null;
    Image imagenExplosion1 = null;
    
    public int posX = 0;
    public int posY = 0;
    
    public int tiempDeVida = 50;
    
    Clip sonidoExplosion;
    
    public Explosion(){
        try {
            sonidoExplosion = AudioSystem.getClip();
            sonidoExplosion.open(AudioSystem.getAudioInputStream(getClass().getResource("/sonidos/explosion.wav")));
            
        } catch (Exception e) {
        } 
        
    }
    
    
    
}
