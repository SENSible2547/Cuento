package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Imagen extends JFrame{
	
public static void main(String[] args) throws MalformedURLException, IOException {
		
		JFrame f=new JFrame("Paginita");
		
		JPanel panel = new JPanel();
		JLabel label1,label2,label3;
		


		ImageIcon imagen1 = new ImageIcon(ImageIO.read((new URL("https://img.freepik.com/fotos-premium/gatitos-kawaii-peluche-esponjosos-hermosa-imagen-arte-generado-ai_843679-5987.jpg"))));
		//626x626
		ImageIcon imagen2 = new ImageIcon(ImageIO.read((new URL("https://img.freepik.com/foto-gratis/vista-frontal-personaje-espeluznante-posando_23-2150701112.jpg"))));
		//351x626
		ImageIcon imagen3 = new ImageIcon(ImageIO.read((new URL("https://img.freepik.com/fotos-premium/bosque-fantasia-magia_717440-386.jpg"))));
		//351x626
        panel.setBackground(new Color(167, 139, 254));
        
        label1 = new JLabel("", imagen1, SwingConstants.CENTER);
        label2 = new JLabel("", imagen2, SwingConstants.CENTER);
        label3 = new JLabel("", imagen3, SwingConstants.CENTER);
        
        label1.setBounds(10, 10, imagen1.getIconWidth(), imagen1.getIconHeight());
        label2.setBounds(646, 10, imagen2.getIconWidth(), imagen2.getIconHeight());
        label3.setBounds(1007, 10, imagen3.getIconWidth(), imagen3.getIconHeight());
        
        f.add(label1);
        f.add(label2);
        f.add(label3);


        f.setSize(1500, 1000);
        f.add(panel);
        f.setVisible(true);
        
	}
	  

}


