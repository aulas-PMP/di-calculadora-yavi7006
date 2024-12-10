import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PadNumerico extends KeyAdapter{

    @Override
    public void keyPressed(KeyEvent e) {
        int codigo = e.getKeyCode();
        switch(codigo){
            case 96:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "0";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "0";
                } else{
                    Calculadora.calc.num2 += "0";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 97:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "1";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "1";
                } else{
                    Calculadora.calc.num2 += "1";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 98:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "2";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "2";
                } else{
                    Calculadora.calc.num2 += "2";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 99:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "3";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "3";
                } else{
                    Calculadora.calc.num2 += "3";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 100:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "4";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "4";
                } else{
                    Calculadora.calc.num2 += "4";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 101:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "5";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "5";
                } else{
                    Calculadora.calc.num2 += "5";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 102:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "6";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "6";
                } else{
                    Calculadora.calc.num2 += "6";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 103:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "7";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "7";
                } else{
                    Calculadora.calc.num2 += "7";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 104:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "8";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "8";
                } else{
                    Calculadora.calc.num2 += "8";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 105:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "9";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += "9";
                } else{
                    Calculadora.calc.num2 += "9";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 106:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "*";
                Calculadora.calc.signo = String.valueOf("*");
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 107:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "+";
                Calculadora.calc.signo = String.valueOf("+");
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 109:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "-";
                Calculadora.calc.signo = String.valueOf("-");
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 110:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += ".";
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += ".";
                } else{
                    Calculadora.calc.num2 += ".";
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 111:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion += "/";
                Calculadora.calc.signo = String.valueOf("/");
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 8:
                Calculadora.calc.label.setForeground(Color.BLACK);
                Calculadora.calc.operacion = "";
                Calculadora.calc.num1 = "";
                Calculadora.calc.num2 = "";
                Calculadora.calc.signo = "";
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 10:
                Calculadora.operar();
                Calculadora.calc.operacion = "";
                Calculadora.calc.num1 = "";
                Calculadora.calc.num2 = "";
                Calculadora.calc.signo = "";
                break;
        }
    }
}
