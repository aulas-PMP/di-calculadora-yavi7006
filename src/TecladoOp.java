import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoOp extends JPanel{
    
    JButton bt10;
    JButton bt11;
    JButton bt12;
    JButton bt13;
    JButton bt14;
    JButton bt15;
    JButton bt16;
    JButton bt17;

    public TecladoOp(){

        setLayout(new GridLayout(4, 2));

        bt10 = new JButton("+");
        bt11 = new JButton("-");
        bt12 = new JButton("*");
        bt13 = new JButton("/");
        bt14 = new JButton("C");
        bt15 = new JButton("=");
        bt16 = new JButton(".");
        bt17 = new JButton(",");

        bt10.setForeground(Color.WHITE);
        bt11.setForeground(Color.WHITE);
        bt12.setForeground(Color.WHITE);
        bt13.setForeground(Color.WHITE);
        bt14.setForeground(Color.WHITE);
        bt15.setForeground(Color.WHITE);
        bt16.setForeground(Color.WHITE);
        bt17.setForeground(Color.WHITE);
        
        add(bt10);
        bt10.setBackground(Color.GRAY);
        add(bt11);
        bt11.setBackground(Color.GRAY);
        add(bt12);
        bt12.setBackground(Color.GRAY);
        add(bt13);
        bt13.setBackground(Color.GRAY);
        add(bt14);
        bt14.setBackground(Color.GRAY);
        add(bt15);
        bt15.setBackground(Color.GRAY);
        add(bt16);
        bt16.setBackground(Color.GRAY);
        add(bt17);
        bt17.setBackground(Color.GRAY);
        
        bt10.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt11.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt12.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt13.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt14.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt15.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt16.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        bt17.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), 30));
        
    }
}
