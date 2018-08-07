import javax.swing.JOptionPane;

public class Operacao {
	 public static void main(String[] args) {
	      
	      String numeroA = JOptionPane.showInputDialog(null, "Digite um número:");
	      String numeroB = JOptionPane.showInputDialog(null, "Digite o segundo número:");
	      
	      double a = Double.parseDouble(numeroA);
	      double b = Double.parseDouble(numeroB);
	      
	      double soma = a + b;
	      double sub = a - b;
	      double mult = a * b;
	      double div = a / b;
	      
	      JOptionPane.showMessageDialog(null,
	              "Soma: " + soma + "\n" +
	              "Subtração: " + sub + "\n" +
	              "Multiplicação: " + mult + "\n" +
	              "Divisão: " + div
	        );
	      
	 }    
}
