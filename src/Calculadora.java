import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Calculadora extends JFrame{
    
    public static Calculadora calc;

    public String operacion;
    public String num1;
    public String num2;
    public String signo;
    public String resultado;
    public JLabel label;
    public TecladoNumeros tcl;
    public TecladoOp tcl2;
    public BotonesAction btAction;
    public PadNumerico pd;
    public JButton modo;

    public Calculadora(){

        operacion = "";
        num1 = "";
        num2 = "";
        signo = "";
        resultado = "";
        label = new JLabel(operacion);

    }

    public static void operar(){
        float result = 0;
        try{
            switch (Calculadora.calc.signo) {
                case "+":
                    result = Float.parseFloat(Calculadora.calc.num1)+Float.parseFloat(Calculadora.calc.num2);
                    break;
                case "-":
                    result = Float.parseFloat(Calculadora.calc.num1)-Float.parseFloat(Calculadora.calc.num2);
                    break;
                case "*":
                    result = Float.parseFloat(Calculadora.calc.num1)*Float.parseFloat(Calculadora.calc.num2);
                    break;
                case "/":
                    result = Float.parseFloat(Calculadora.calc.num1)/Float.parseFloat(Calculadora.calc.num2);
                    break;
                default:
                    break;
            }
            
            Calculadora.calc.resultado += String.valueOf(result);
            if(Calculadora.calc.resultado.endsWith(".0")){
                Calculadora.calc.resultado = Calculadora.calc.resultado.substring(0, Calculadora.calc.resultado.indexOf("."));
            }
            if(Calculadora.calc.operacion.contains(",")){
                Calculadora.calc.resultado = Calculadora.calc.resultado.replace(".", ",");
            }
            if(result<0){
                Calculadora.calc.label.setForeground(Color.RED);
            }
            Calculadora.calc.label.setText(Calculadora.calc.resultado);
            Calculadora.calc.resultado = "";
        } catch(NumberFormatException e){
            Calculadora.calc.resultado = "SYNTAX ERROR";
            Calculadora.calc.label.setText(Calculadora.calc.resultado);
            Calculadora.calc.resultado = "";
        }
    }

    public static void iniciar(){
        Calculadora.calc = new Calculadora();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int ancho = dim.width;
        int altura = dim.height;
        Calculadora.calc.setTitle("Calculadora");
        Calculadora.calc.setBounds(ancho/4, (altura/2-300), ancho/2, 600);

        Calculadora.calc.setLayout(new BorderLayout());

        Calculadora.calc.label.setFont(new Font(Calculadora.calc.label.getFont().getFontName(), Calculadora.calc.label.getFont().getStyle(), 30));
        Calculadora.calc.label.setPreferredSize(new Dimension(ancho, altura/10));
        Calculadora.calc.add(Calculadora.calc.label,BorderLayout.PAGE_START);

        Calculadora.calc.tcl = new TecladoNumeros();
        Calculadora.calc.add(Calculadora.calc.tcl,BorderLayout.LINE_START);
        Calculadora.calc.tcl.setPreferredSize(new Dimension(ancho/2/3,altura));

        Calculadora.calc.tcl2 = new TecladoOp();
        Calculadora.calc.add(Calculadora.calc.tcl2,BorderLayout.LINE_END);
        Calculadora.calc.tcl2.setPreferredSize(new Dimension(ancho/2/3,altura));

        Calculadora.calc.btAction = new BotonesAction();
        
        Calculadora.calc.addKeyListener(Calculadora.calc.pd);
        Calculadora.calc.tcl.bt0.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl.bt1.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl.bt2.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl.bt3.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl.bt4.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl.bt5.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl.bt6.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl.bt7.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl.bt8.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl.bt9.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl2.bt10.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl2.bt11.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl2.bt12.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl2.bt13.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl2.bt14.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl2.bt15.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl2.bt16.addActionListener(Calculadora.calc.btAction);
        Calculadora.calc.tcl2.bt17.addActionListener(Calculadora.calc.btAction);

        Calculadora.calc.modo = new JButton("Libre");
        Calculadora.calc.add(Calculadora.calc.modo,BorderLayout.CENTER);
        Calculadora.calc.modo.setBackground(Color.ORANGE);
        Calculadora.calc.modo.setFont(new Font(Calculadora.calc.modo.getFont().getFontName(), Calculadora.calc.modo.getFont().getStyle(), 15));
        Calculadora.calc.modo.addActionListener(new ModoAction());

        Calculadora.calc.pd = new PadNumerico();

        Calculadora.calc.addWindowStateListener(new WindowStateListener() {
            @Override
            public void windowStateChanged(WindowEvent e) {
                if(e.getNewState()==MAXIMIZED_BOTH){
                    Calculadora.calc.tcl.setPreferredSize(new Dimension(ancho/3, altura));
                    Calculadora.calc.tcl2.setPreferredSize(new Dimension(ancho/3, altura));
                } else if(e.getNewState()==NORMAL){
                    Calculadora.calc.tcl.setPreferredSize(new Dimension(ancho/2/3,altura));
                    Calculadora.calc.tcl2.setPreferredSize(new Dimension(ancho/2/3,altura));
                }
            }
        });

        Calculadora.calc.setVisible(true);
        Calculadora.calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static class ModoAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            JButton boton = (JButton) e.getSource();
            
            if(boton.getText().equals("Libre")){
                boton.setText("Ratón");
            } else if(boton.getText().equals("Ratón")){
                boton.setText("Teclado");
            } else if(boton.getText().equals("Teclado")){
                boton.setText("Libre");
            }

            if(boton.getText().equals("Libre")){
                Calculadora.calc.modo.setText("Libre");
                Calculadora.calc.tcl.bt0.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt1.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt2.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt3.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt4.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt5.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt6.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt7.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt8.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt9.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt10.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt11.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt12.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt13.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt14.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt15.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt16.addActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt17.addActionListener(Calculadora.calc.btAction);
            } else if(boton.getText().equals("Ratón")){
                Calculadora.calc.modo.setText("Ratón");
                Calculadora.calc.removeKeyListener(Calculadora.calc.pd);
            } else if(boton.getText().equals("Teclado")){
                Calculadora.calc.modo.setText("Teclado");
                Calculadora.calc.addKeyListener(Calculadora.calc.pd);
                Calculadora.calc.tcl.bt0.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt1.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt2.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt3.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt4.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt5.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt6.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt7.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt8.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl.bt9.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt10.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt11.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt12.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt13.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt14.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt15.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt16.removeActionListener(Calculadora.calc.btAction);
                Calculadora.calc.tcl2.bt17.removeActionListener(Calculadora.calc.btAction);
            }
        }
        
    }

    public static void main(String[] args) throws Exception {
        iniciar();
    }
}
