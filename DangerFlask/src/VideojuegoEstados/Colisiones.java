package VideojuegoEstados;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

/**
 *
 * @author SergioSanzSacristan
 */
public class Colisiones {

    private float x_, y_;

    public Colisiones(float x, float y) {
        this.x_ = x;
        this.y_ = y;
    }
    private Rectangle rectSalida1 = new Rectangle(1167, 495, 50, 25);
    private Rectangle rectSalida2 = new Rectangle(1167, 270, 50, 25);
    private Rectangle rectSalida3 = new Rectangle(335, 592, 50, 50);
    private Rectangle rectSalida4 = new Rectangle(478, 592, 50, 50);
    private Rectangle cambiarMapa1 = new Rectangle(1213, 499, 1, 45);
    private Rectangle cambiarMapa2 = new Rectangle(1213, 275, 1, 45);
    private Rectangle cambiarMapa3 = new Rectangle(336, 638, 45, 1);
    private Rectangle cambiarMapa4 = new Rectangle(480, 638, 45, 1);
    private Rectangle rectAnim = new Rectangle(x_, y_, 16, 27);

    public boolean animDentro1(boolean[][] paredes, float x, float y) {
        if (((paredes[(int) ((x * 2) / 16)][(int) ((y * 2) / 16) + 3] == true)
                || (paredes[(int) ((x * 2) / 16) + 2][(int) ((y * 2) / 16) + 3] == true)) && rectAnim.intersects(rectSalida1)) {
            return false;
        } else if ((paredes[(int) ((x * 2) / 16)][(int) ((y * 2) / 16) + 3] == true)
                || (paredes[(int) ((x * 2) / 16) + 2][(int) ((y * 2) / 16) + 3] == true)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean animDentro2(boolean[][] paredes, float x, float y) {
        if (((paredes[(int) ((x * 2) / 16)][(int) ((y * 2) / 16) + 3] == true)
                || (paredes[(int) ((x * 2) / 16) + 2][(int) ((y * 2) / 16) + 3] == true)) && rectAnim.intersects(rectSalida2)) {
            return false;
        } else if ((paredes[(int) ((x * 2) / 16)][(int) ((y * 2) / 16) + 3] == true)
                || (paredes[(int) ((x * 2) / 16) + 2][(int) ((y * 2) / 16) + 3] == true)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean animDentro3(boolean[][] paredes, float x, float y) {
        if (((paredes[(int) ((x * 2) / 16)][(int) ((y * 2) / 16) + 3] == true)
                || (paredes[(int) ((x * 2) / 16) + 2][(int) ((y * 2) / 16) + 3] == true)) && rectAnim.intersects(rectSalida3)) {
            return false;
        } else if ((paredes[(int) ((x * 2) / 16)][(int) ((y * 2) / 16) + 3] == true)
                || (paredes[(int) ((x * 2) / 16) + 2][(int) ((y * 2) / 16) + 3] == true)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean animDentro4(boolean[][] paredes, float x, float y) {
        if (((paredes[(int) ((x * 2) / 16)][(int) ((y * 2) / 16) + 3] == true)
                || (paredes[(int) ((x * 2) / 16) + 2][(int) ((y * 2) / 16) + 3] == true)) && rectAnim.intersects(rectSalida4)) {
            return false;
        } else if ((paredes[(int) ((x * 2) / 16)][(int) ((y * 2) / 16) + 3] == true)
                || (paredes[(int) ((x * 2) / 16) + 2][(int) ((y * 2) / 16) + 3] == true)) {
            return true;
        } else {
            return false;
        }
    }

    public void actualizar(float x, float y) {
        rectAnim.setX(x);
        rectAnim.setY(y);
    }

    public void dibujar(Graphics g) {
        g.drawRect(rectAnim.getX(), rectAnim.getY(), rectAnim.getWidth(), rectAnim.getHeight());
        g.drawRect(cambiarMapa2.getX(), cambiarMapa2.getY(), cambiarMapa2.getWidth(), cambiarMapa2.getHeight());

    }

    public boolean cambiarMapa1() {
        if (rectAnim.intersects(cambiarMapa1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cambiarMapa2() {
        if (rectAnim.intersects(cambiarMapa2)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cambiarMapa3() {
        if (rectAnim.intersects(cambiarMapa3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cambiarMapa4() {
        if (rectAnim.intersects(cambiarMapa4)) {
            return true;
        } else {
            return false;
        }
    }
}
