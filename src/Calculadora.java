import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Calculadora extends JFrame{
    
    public static String operacion = "";
    public static ArrayList<Character> signo = new ArrayList<>();
    public String resultado = "";
    public static JLabel label = new JLabel(operacion);

    public Calculadora(){

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int ancho = dim.width;
        int altura = dim.height;
        setTitle("Calculadora");
        setBounds(ancho/4, (altura/2-300), ancho/2, 600);

        setLayout(new BorderLayout());

        label.setFont(new Font(label.getFont().getFontName(), label.getFont().getStyle(), 30));
        label.setPreferredSize(new Dimension(ancho, altura/10));
        add(label,BorderLayout.PAGE_START);

        TecladoNumeros tcl = new TecladoNumeros();
        add(tcl,BorderLayout.LINE_START);
        if(getExtendedState()==Frame.MAXIMIZED_BOTH){
            tcl.setPreferredSize(new Dimension(ancho/2, altura));
        } else{
            tcl.setPreferredSize(new Dimension(ancho/2/3,altura));
        }

        TecladoOp tcl2 = new TecladoOp();
        add(tcl2,BorderLayout.LINE_END);
        if(this.getExtendedState()==Frame.MAXIMIZED_BOTH){
            tcl2.setPreferredSize(new Dimension(ancho/3, altura));
        } else{
            tcl2.setPreferredSize(new Dimension(ancho/2/3,altura));
        }
        

        addKeyListener(new PadNumerico());

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void operar(){
        
    }

    public static void main(String[] args) throws Exception {
        new Calculadora();
    }
}
