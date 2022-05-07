package ico.fes.ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

 public class EventosRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
         System.out.println("Boton presionado ");
    }

    @Override
    public void mousePressed(MouseEvent e) {
         System.out.println("Boton presionado ");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         System.out.println("Boton liberado "); 
    }

    @Override
    public void mouseEntered(MouseEvent e) {
          System.out.println("Cursor entro al componente  ");
    }

    @Override
    public void mouseExited(MouseEvent e) {
       System.out.println("el cursor salió ");   
    }
    
}