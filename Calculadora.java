import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        
        int num1, num2;
        double quociente, potencia;

        
        String input1 = JOptionPane.showInputDialog(null, "Digite o primeiro número inteiro:");
        num1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog(null, "Digite o segundo número inteiro:");
        num2 = Integer.parseInt(input2);

       
        if (num2 != 0) {
            quociente = (double) num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
            return; 
        }

        
        potencia = Math.pow(num1, num2);

        
        String resultado = "Resultados:\n"
                + "Quociente da divisão de " + num1 + " por " + num2 + " = " + quociente + "\n"
                + "Potência de " + num1 + " elevado a " + num2 + " = " + potencia;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
