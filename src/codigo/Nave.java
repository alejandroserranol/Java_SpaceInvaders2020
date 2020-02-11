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

    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;

    public Nave() {
        
    }

    public void mueve() {
        if (pulsadoIzquierda && posX > 0) {
            posX-=3;
        }
        if (pulsadoDerecha && posX < VentanaJuego.ANCHOPANTALLA - imagen.getWidth(null)*1.4) {
            posX+=3;
        }
    }

    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        if (!pulsadoDerecha) {
            this.pulsadoIzquierda = pulsadoIzquierda;
            this.pulsadoDerecha = false;
        }
    }

    public boolean isPulsadoDerecha() {
        return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
        if (!pulsadoIzquierda) {
            this.pulsadoDerecha = pulsadoDerecha;
            this.pulsadoIzquierda = false;
        }
    }

}
