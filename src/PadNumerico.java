import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PadNumerico extends KeyAdapter{
    
    int codigo;
    char valor;

    @Override
    public void keyTyped(KeyEvent e) {
        codigo = e.getKeyCode();
        valor = (char) codigo;
        switch(codigo){
            case 96:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 97:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 98:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 99:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 100:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 101:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 102:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 103:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 104:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 105:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 106:
                Calculadora.calc.operacion += valor;
                Calculadora.calc.signo = String.valueOf(valor);
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 107:
                Calculadora.calc.operacion += valor;
                Calculadora.calc.signo = String.valueOf(valor);
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 109:
                Calculadora.calc.operacion += valor;
                Calculadora.calc.signo = String.valueOf(valor);
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 110:
                Calculadora.calc.operacion += valor;
                if(Calculadora.calc.signo.isBlank()){
                    Calculadora.calc.num1 += valor;
                } else{
                    Calculadora.calc.num2 += valor;
                }
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 111:
                Calculadora.calc.operacion += valor;
                Calculadora.calc.signo = String.valueOf(valor);
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 8:
                Calculadora.calc.operacion = "";
                Calculadora.calc.num1 = "";
                Calculadora.calc.num2 = "";
                Calculadora.calc.signo = "";
                Calculadora.calc.label.setText(Calculadora.calc.operacion);
                break;
            case 10:
                Calculadora.operar();
                break;
        }
    }
}
