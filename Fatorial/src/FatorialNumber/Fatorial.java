package FatorialNumber;

import javax.swing.JOptionPane;

public class Fatorial {

	
	public static void main(String[] args) {
	
		int intcontador = 1, fatorial, valor;
		valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre numero", "entrada", JOptionPane.INFORMATION_MESSAGE));
		fatorial = 1;
		String result = "o fatorial de " + valor + " é :";
		while (intcontador <= valor) {
			fatorial = fatorial + (fatorial * (valor - 1) );
			valor--;
		}
		JOptionPane.showMessageDialog(null, result + fatorial, "Resultado", JOptionPane.INFORMATION_MESSAGE);	
	}
}
