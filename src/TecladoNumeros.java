import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoNumeros extends JPanel{
    
    JButton bt0;
    JButton bt1;
    JButton bt2;
    JButton bt3;
    JButton bt4;
    JButton bt5;
    JButton bt6;
    JButton bt7;
    JButton bt8;
    JButton bt9;

    public TecladoNumeros(){

        setLayout(new GridLayout(4, 3));

        bt0 = new JButton("0");
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");

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

        bt0.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt1.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt2.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt3.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt4.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt5.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt6.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt7.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt8.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt9.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));

        add(bt1);
        bt1.setBackground(Color.GRAY);
        add(bt2);
        bt2.setBackground(Color.GRAY);
        add(bt3);
        bt3.setBackground(Color.GRAY);
        add(bt4);
        bt4.setBackground(Color.GRAY);
        add(bt5);
        bt5.setBackground(Color.GRAY);
        add(bt6);
        bt6.setBackground(Color.GRAY);
        add(bt7);
        bt7.setBackground(Color.GRAY);
        add(bt8);
        bt8.setBackground(Color.GRAY);
        add(bt9);
        bt9.setBackground(Color.GRAY);
        add(bt0);
        bt0.setBackground(Color.GRAY);
        
    }
    
}