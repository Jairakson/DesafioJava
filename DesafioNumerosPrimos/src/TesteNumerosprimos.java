import javax.swing.JOptionPane;

public class TesteNumerosprimos {


	public static void main(String[] args) {
		NumerosPrimos numero =  new NumerosPrimos(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
		numero.ehPrimo(numero);	
	}
}

