package ico.fes.iu;

import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.sax.SAXSource;

public class MiVentana2 extends Frame {
    private Button boton1;
    private FlowLayout layout;
    private TextField cuadroTexto;
    private Label etiqueta;
    
    
    public MiVentana2() throws HeadlessException {
        setTitle("Mi ventana versión 2");
        setSize(300, 200);
        layout=new FlowLayout();
        setLayout(layout);
        boton1 = new Button("Saludar");
        cuadroTexto = new TextField(15);
        etiqueta = new Label("Valor inicial");
        
        this.boton1.addMouseListener( new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                  etiqueta.setText("Hola " + cuadroTexto.getText());
                  System.out.println("X" + e.getX());
                  System.out.println("Y" + e.getY());
                  System.out.println("Que boton" + e.getButton());
            }
            
        });
        
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);   }
        
        } );
        
        this.cuadroTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Enter code:" +KeyEvent.VK_ENTER  );  
                switch (e.getKeyCode()){
                    case KeyEvent.VK_ENTER:
                        System.out.println("Se dio enter");
                        break;      
                    default:
                        System.out.println("Tecla" + e.getKeyChar());
                }
                
            }
        
        });
        
        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
        
        setVisible(true);
    }
}

 