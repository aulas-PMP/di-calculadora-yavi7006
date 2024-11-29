import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoOp extends JPanel{
    
    public TecladoOp(){

        JButton bt10 = new JButton("+");
        JButton bt11 = new JButton("-");
        JButton bt12 = new JButton("*");
        JButton bt13 = new JButton("/");

        JButton bt14 = new JButton("C");
        JButton bt15 = new JButton("=");

        JButton bt16 = new JButton(".");
        JButton bt17 = new JButton("CE");

        setLayout(new GridLayout(4, 2));
        
        add(bt10);
        bt10.setBackground(Color.GRAY);
        bt10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "+";
                Calculadora.signo.add('+');
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
    
        
        add(bt11);
        bt11.setBackground(Color.GRAY);
        bt11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "-";
                Calculadora.signo.add('-');
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        
        add(bt12);
        bt12.setBackground(Color.GRAY);
        bt12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "*";
                Calculadora.signo.add('*');
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt13);
        bt13.setBackground(Color.GRAY);
        bt13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "/";
                Calculadora.signo.add('/');
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt14);
        bt14.setBackground(Color.GRAY);
        bt14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion = "";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        
        add(bt15);
        bt15.setBackground(Color.GRAY);
        bt15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.signo.add('=');
                Calculadora.operar();
            }
        });
        
        

        add(bt16);
        bt16.setBackground(Color.GRAY);
        bt16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += ".";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
    }
}
