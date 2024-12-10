import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BotonesAction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();

        switch (boton.getText()) {
            case "0","1","2","3","4","5","6","7","8","9":
                Calculadora.calc.operacion += boton.getText();
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += boton.getText();
                } else{
                    Calculadora.calc.num2 += boton.getText();
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case "+","-","*","/":
                Calculadora.calc.operacion += boton.getText();
                Calculadora.calc.signo = boton.getText();
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case "C":
                Calculadora.calc.operacion = "";
                Calculadora.calc.num1 = "";
                Calculadora.calc.num2 = "";
                Calculadora.calc.signo = "";
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case "=":
                Calculadora.operar();
                Calculadora.calc.operacion = "";
                Calculadora.calc.num1 = "";
                Calculadora.calc.num2 = "";
                Calculadora.calc.signo = "";
                break;
            case ".",",":
                Calculadora.calc.operacion += boton.getText();
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += ".";
                } else{
                    Calculadora.calc.num2 += ".";
                }
                break;
            default:
                break;
        }
    }
    
}
