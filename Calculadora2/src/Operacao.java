import javax.swing.JOptionPane;

public class Operacao {
	 public static void main(String[] args) {
	      
	      String numeroA = JOptionPane.showInputDialog(null, "Digite um n�mero:");
	      String numeroB = JOptionPane.showInputDialog(null, "Digite o segundo n�mero:");
	      
	      double a = Double.parseDouble(numeroA);
	      double b = Double.parseDouble(numeroB);
	      
	      double soma = a + b;
	      double sub = a - b;
	      
	 }    
}
