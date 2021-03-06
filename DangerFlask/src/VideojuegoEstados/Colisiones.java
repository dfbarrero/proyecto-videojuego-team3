package VideojuegoEstados;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

/**
 *
 * @author SergioSanzSacristan
 */
public class Colisiones {

    private float x_, y_, j, a, b, c, d, e;
    private int tarjeta1 = 0, tarjeta2 = 0, tarjeta3 = 0, tarjeta4 = 0;

    public Colisiones(float x, float y) {
        this.x_ = x;
        this.y_ = y;
    }

    public void setJ(float j) {
        this.j = j;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void setD(float d) {
        this.d = d;
    }

    public void setE(float e) {
        this.e = e;
    }

    public int getTarjeta1() {
        return tarjeta1;
    }

    public int getTarjeta2() {
        return tarjeta2;
    }

    public int getTarjeta3() {
        return tarjeta3;
    }

    public int getTarjeta4() {
        return tarjeta4;
    }

    public void setTarjeta1(int tarjeta1) {
        this.tarjeta1 = tarjeta1;
    }

    public void setTarjeta2(int tarjeta2) {
        this.tarjeta2 = tarjeta2;
    }

    public void setTarjeta3(int tarjeta3) {
        this.tarjeta3 = tarjeta3;
    }

    public void setTarjeta4(int tarjeta4) {
        this.tarjeta4 = tarjeta4;
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
    private Rectangle rectBab1, rectBab2, rectBab3, rectBab4, rectBab5, rectBab6;

    public Rectangle getRectAnim() {
        return rectAnim;
    }

    public void colisiones1() {
        rectBab1 = new Rectangle(j, 576, 25, 15);
        rectBab2 = new Rectangle(a, 224, 25, 15);
        rectBab3 = new Rectangle(b, 496, 25, 15);
        rectBab4 = new Rectangle(656, c, 14, 23);
        rectBab5 = new Rectangle(816, d, 14, 23);
        rectBab6 = new Rectangle(816, e, 14, 23);
    }

    public boolean animDentro1(boolean[][] paredes, float x, float y) {
        if (((paredes[(int) ((x * 2) / 16)][(int) ((y * 2) / 16) + 3] == true)
                || (paredes[(int) ((x * 2) / 16) + 2][(int) ((y * 2) / 16) + 3] == true)) && rectAnim.intersects(rectSalida1)
                && tarjeta1 == 2) {
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

    public void actualizarBab() {
        rectBab1.setX(j);
        rectBab2.setX(a);
        rectBab3.setX(b);
        rectBab4.setY(c);
        rectBab5.setY(d);
        rectBab6.setY(e);
    }

    public void dibujar(Graphics g) {
        //g.drawRect(rectAnim.getX(), rectAnim.getY(), rectAnim.getWidth(), rectAnim.getHeight());
        //g.drawRect(cambiarMapa2.getX(), cambiarMapa2.getY(), cambiarMapa2.getWidth(), cambiarMapa2.getHeight());
        //g.drawRect(rectBabosa.getX(), rectBabosa.getY(), rectBabosa.getWidth(), rectBabosa.getHeight());

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

    public boolean muere() {
        if (rectAnim.intersects(rectBab1) || rectAnim.intersects(rectBab2) || rectAnim.intersects(rectBab3)
                || rectAnim.intersects(rectBab4) || rectAnim.intersects(rectBab5) || rectAnim.intersects(rectBab6)) {
            return true;
        } else {
            return false;
        }
    }
}
