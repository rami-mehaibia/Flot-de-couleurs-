
package VueControler;

import Model.CaseType;
import Model.CaseTypeColor;
import Model.Niveau;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Random;

// TODO : redéfinir la fonction hashValue() et equals(Object) si vous souhaitez utiliser la hashmap de VueControleurGrille avec VueCase en clef

public class VueCase extends JPanel {
    private int x, y;
    private CaseType type;
    public static Niveau currentLevel = new Niveau();;

    public VueCase(int _x, int _y) {
        x = _x;
        y = _y;
        if (currentLevel.getLevel1()[_x][_y] != null) {
            this.type = currentLevel.getLevel1()[_x][_y];
        } else {
            this.type = CaseType.empty;
        }
    }


    private void drawNoon(Graphics g) {
        g.drawLine(getWidth()/2, getHeight()/2, getWidth()/2, 0);
    }

    private void drawNine(Graphics g) {
        g.drawLine(0, getHeight()/2, getWidth()/2, getHeight()/2);
    }

    private void drawSix(Graphics g) {
        g.drawLine(getWidth()/2, getHeight()/2, getWidth()/2, getHeight());
    }

    private void drawThree(Graphics g) {
        g.drawLine(getWidth()/2, getHeight()/2, getWidth(), getHeight()/2);
    }

    private void drawHalf(Graphics g) {
        g.drawLine(getWidth()/5,  getHeight()/2, getWidth()/2, getHeight());
    }


    private Color lighterShade(Color color){
        Color lighter;
        double r = color.getRed() + (255-color.getRed()) * .5;
        double g = color.getGreen() + (255-color.getGreen()) * .5;
        double b = color.getBlue() + (255-color.getBlue()) *  .5;
        lighter = new Color((int)r,(int)g,(int)b);
        return lighter;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());

        g.drawRoundRect(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2, 5, 5);

        Rectangle2D deltaText =  g.getFont().getStringBounds("0", g.getFontMetrics().getFontRenderContext()); // "0" utilisé pour gabarit
        Color lighterShade;
        switch(type) {
            case S1 :
                g.setColor(CaseTypeColor.S1.getValue());
                lighterShade = lighterShade(CaseTypeColor.S1.getValue());
                g.setColor(lighterShade);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
                g.drawRect(0, 0, getWidth(), getHeight());
                g.drawString("", getWidth()/2 - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                break;


            case S2 :
                g.setColor(CaseTypeColor.S2.getValue());
                lighterShade = lighterShade(CaseTypeColor.S2.getValue());
                g.setColor(lighterShade);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
                g.drawRect(0, 0, getWidth(), getHeight());
                g.drawString("", getWidth()/2 - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                break;
            case S3 :
                g.setColor(CaseTypeColor.S3.getValue());
                lighterShade = lighterShade(CaseTypeColor.S3.getValue());
                g.setColor(lighterShade);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
                g.drawRect(0, 0, getWidth(), getHeight());
                g.drawString("", getWidth()/2 - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                //g.drawString("3", getWidth()/2  - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                break;
            case S4 :
                g.setColor(CaseTypeColor.S4.getValue());
                lighterShade = lighterShade(CaseTypeColor.S4.getValue());
                g.setColor(lighterShade);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
                g.drawRect(0, 0, getWidth(), getHeight());
                g.drawString("", getWidth()/2 - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
               // g.drawString("4", getWidth()/2  - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                break;
            case S5 :
                g.setColor(CaseTypeColor.S5.getValue());
                lighterShade = lighterShade(CaseTypeColor.S5.getValue());
                g.setColor(lighterShade);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
                g.drawRect(0, 0, getWidth(), getHeight());
                g.drawString("", getWidth()/2 - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                //g.drawString("5", getWidth()/2  - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                break;
            case S6 :
                g.setColor(CaseTypeColor.S6.getValue());
                lighterShade = lighterShade(CaseTypeColor.S6.getValue());
                g.setColor(lighterShade);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
                g.drawRect(0, 0, getWidth(), getHeight());
                g.drawString("", getWidth()/2 - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                //g.drawString("", getWidth()/2  - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                break;
            case empty:
                g.setColor(CaseTypeColor.empty.getValue());
                lighterShade = lighterShade(CaseTypeColor.empty.getValue());
                g.setColor(lighterShade);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.black);
                g.drawRect(0, 0, getWidth(), getHeight());
                g.drawString("", getWidth()/2 - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                //g.drawString("", getWidth()/2  - (int) deltaText.getCenterX(), getHeight()/2 - (int) deltaText.getCenterY());
                break;
            case h0v0 :
                drawNine(g);
                drawNoon(g);
                break;
            case h0v1 :
                drawNine(g);
                drawSix(g);
                break;
            case h1v0:
                // TODO
                drawNoon(g);
                drawThree(g);
                break;
            case h1v1 :
                drawThree(g);
                drawSix(g);
                break;
            case h0h1:
                drawThree(g);
                drawNine(g);
                break;
            case v0v1:
                drawNoon(g);
                drawSix(g);
                break;
            case cross:
                // Arrow up
                drawNoon(g);
                // Arrow down
                drawSix(g);
                // Arrow right
                drawThree(g);
                // Arrow left
                drawNine(g);
                break;

        }
    }
    public String toString() {
        return x + ", " + y;

    }

}

