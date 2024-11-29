import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoNumeros extends JPanel{
    
    public TecladoNumeros(){

        JButton bt0 = new JButton("0");
        JButton bt1 = new JButton("1");
        JButton bt2 = new JButton("2");
        JButton bt3 = new JButton("3");
        JButton bt4 = new JButton("4");
        JButton bt5 = new JButton("5");
        JButton bt6 = new JButton("6");
        JButton bt7 = new JButton("7");
        JButton bt8 = new JButton("8");
        JButton bt9 = new JButton("9");

        setLayout(new GridLayout(4, 3));

        bt1.setForeground(Color.WHITE);
        bt2.setForeground(Color.WHITE);
        bt3.setForeground(Color.WHITE);
        bt4.setForeground(Color.WHITE);
        bt5.setForeground(Color.WHITE);
        bt6.setForeground(Color.WHITE);
        bt7.setForeground(Color.WHITE);
        bt8.setForeground(Color.WHITE);
        bt9.setForeground(Color.WHITE);
        bt0.setForeground(Color.WHITE);

        add(bt1);
        bt1.setBackground(Color.GRAY);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "1";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt2);
        bt2.setBackground(Color.GRAY);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "2";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt3);
        bt3.setBackground(Color.GRAY);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "3";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt4);
        bt4.setBackground(Color.GRAY);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "4";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt5);
        bt5.setBackground(Color.GRAY);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "5";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt6);
        bt6.setBackground(Color.GRAY);
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "6";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt7);
        bt7.setBackground(Color.GRAY);
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "7";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt8);
        bt8.setBackground(Color.GRAY);
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "8";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt9);
        bt9.setBackground(Color.GRAY);
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "9";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
        add(bt0);
        bt0.setBackground(Color.GRAY);
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "0";
                Calculadora.label.setText(Calculadora.operacion);
            }
        });
        
    }
}
