package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FondoPanel extends JPanel{
    private Image imagen;
    private ImageIcon lblimagen;
    private Icon icono;
        
    @Override
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/img/fondo.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
    
    public void escalarImagen (JLabel lbl, String ruta) {
        this.lblimagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.lblimagen.getImage().getScaledInstance(
                        lbl.getWidth(), 
                        lbl.getHeight(), 
                        Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }
}
