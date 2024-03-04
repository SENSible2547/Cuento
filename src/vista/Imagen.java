package vista;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
class Imagen
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("Web layout...");
         ImageIcon imagen1 = new ImageIcon ("imagenes/a.png");
         ImageIcon imagen2 = new ImageIcon ("imagenes/b.png");
         ImageIcon imagen3 = new ImageIcon ("imagenes/c.png");
         ImageIcon imagen4 = new ImageIcon ("imagenes/d.png");
         ImageIcon imagen5 = new ImageIcon ("imagenes/e.png");
         ImageIcon imagen6 = new ImageIcon ("imagenes/f.png");
        //declare my jlabels...........
        JLabel label1, label2, label3, label4,label6, label5;
        // Set up first subpanel
        JPanel panel = new JPanel();
        panel.setPreferredSize (new Dimension(400, 400));
        panel.setBackground (Color.cyan);
        label1 = new JLabel ("a", imagen1, SwingConstants.CENTER);
        label2 = new JLabel ("b",imagen2, SwingConstants.LEFT);
        label3 = new JLabel ("c", imagen3, SwingConstants.CENTER);
        label4 = new JLabel ("d", imagen4, SwingConstants.LEFT);
        label5 = new JLabel ("e", imagen5, SwingConstants.CENTER);
        label6 = new JLabel ("f", imagen6, SwingConstants.LEFT);
        panel.add (label1);
        panel.add (label2);
        panel.add (label3);
        panel.add (label4);
        panel.add (label5);
        panel.add (label6);
        f.setSize(500,500);
        f.add(panel);
        f.setVisible(true);  

        }
}


