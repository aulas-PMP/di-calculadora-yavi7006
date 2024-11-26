import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Calculadora extends JFrame{
    
    public static String operacion = "";
    public static ArrayList<Character> signo = new ArrayList<>();

    public Calculadora(){

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int ancho = dim.width;
        int altura = dim.height;
        setTitle("Calculadora");
        setBounds(ancho/4, (altura/2-300), ancho/2, 600);

        JLabel label = new JLabel(operacion);
        add(label);
        label.setBounds(0, 0, ancho, altura/6);
        label.setVisible(true);

        Teclado tcl = new Teclado();
        tcl.setLocation(0, altura/6);
        add(tcl);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void operar(){

    }

    public static void main(String[] args) throws Exception {
        new Calculadora();
    }
}
