import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PadNumerico extends KeyAdapter{
    
    int codigo;
    char valor;

    @Override
    public void keyPressed(KeyEvent e) {
        codigo = e.getKeyCode();
        valor = e.getKeyChar();
        switch(codigo){
            case 96:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 97:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 98:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 99:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 100:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 101:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 102:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 103:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 104:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 105:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 106:
                Calculadora.operacion += valor;
                Calculadora.signo.add(valor);
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 107:
                Calculadora.operacion += valor;
                Calculadora.signo.add(valor);
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 109:
                Calculadora.operacion += valor;
                Calculadora.signo.add(valor);
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 110:
                Calculadora.operacion += valor;
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 111:
                Calculadora.operacion += valor;
                Calculadora.signo.add(valor);
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 8:
                Calculadora.operacion = "";
                Calculadora.label.setText(Calculadora.operacion);
                break;
            case 10:
                Calculadora.signo.add('=');
                Calculadora.operar();
                break;
        }
    }
}
