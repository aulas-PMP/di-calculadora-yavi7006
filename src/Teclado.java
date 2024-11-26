import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Teclado extends JPanel{
    
    public Teclado(){

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

        JButton bt10 = new JButton("+");
        JButton bt11 = new JButton("-");
        JButton bt12 = new JButton("*");
        JButton bt13 = new JButton("/");

        JButton bt14 = new JButton("C");
        JButton bt15 = new JButton("=");

        JButton bt16 = new JButton(".");

        setLayout(new GridLayout(5, 5));

        add(bt1);
        bt1.setBackground(Color.GRAY);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "1";
            }
        });
        
        add(bt2);
        bt2.setBackground(Color.GRAY);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "2";
            }
        });
        
        add(bt3);
        bt3.setBackground(Color.GRAY);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "3";
            }
        });
        
        add(bt10);
        bt10.setBackground(Color.GRAY);
        bt10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "+";
                Calculadora.signo.add('+');
            }
        });
        
        add(bt4);
        bt4.setBackground(Color.GRAY);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "4";
            }
        });
        
        add(bt5);
        bt5.setBackground(Color.GRAY);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "5";
            }
        });
        
        add(bt6);
        bt6.setBackground(Color.GRAY);
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "6";
            }
        });
        
        add(bt11);
        bt11.setBackground(Color.GRAY);
        bt11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "-";
                Calculadora.signo.add('-');
            }
        });
        
        add(bt7);
        bt7.setBackground(Color.GRAY);
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "7";
            }
        });
        
        add(bt8);
        bt8.setBackground(Color.GRAY);
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "8";
            }
        });
        
        add(bt9);
        bt9.setBackground(Color.GRAY);
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "9";
            }
        });
        
        add(bt12);
        bt12.setBackground(Color.GRAY);
        bt12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "*";
                Calculadora.signo.add('*');
            }
        });
        
        add(bt14);
        bt14.setBackground(Color.GRAY);
        bt14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                
            }
        });
        
        add(bt0);
        bt0.setBackground(Color.GRAY);
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "0";
            }
        });
        
        add(bt15);
        bt15.setBackground(Color.GRAY);
        bt15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operar();
            }
        });
        
        add(bt13);
        bt13.setBackground(Color.GRAY);
        bt13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += "/";
                Calculadora.signo.add('/');
            }
        });

        add(bt16);
        bt16.setBackground(Color.GRAY);
        bt16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Calculadora.operacion += ".";
            }
        });
    }
}
