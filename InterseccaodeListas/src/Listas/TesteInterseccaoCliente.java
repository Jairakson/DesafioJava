import java.util.ArrayList;
import java.util.Collections;

public class TesteInterseccaoCliente {
	
	public static void main(String[] args) {

		// ListaA com clientes Premium
		ArrayList<String> clientesPremium = new ArrayList<String>();

		// ListaB com clientes sem compras nos últimos 3 meses
		ArrayList<String> clientesSemCompra3Meses = new ArrayList<String>();

		// Teste 1
		// Clientes Premium - Teste que passa na validação
		clientesPremium.add("clienteP4");
		clientesPremium.add("clienteP1");
		clientesPremium.add("clienteP7");
		clientesPremium.add("clienteP2");
		clientesPremium.add("clienteP5");
		clientesPremium.add("clienteP6");
		clientesPremium.add("clienteP3");

		// Teste 2
		// Clientes Premium - Teste que não passa na validação
		/*clientesPremium.add("clienteP4");
		clientesPremium.add("clienteA1");
		clientesPremium.add("clienteP7");
		clientesPremium.add("clienteP2");
		clientesPremium.add("clienteP9");
		clientesPremium.add("clienteP6");
		clientesPremium.add("clienteZ3");*/
		

		// Clientes sem compra nos últimos 3 meses
		clientesSemCompra3Meses.add("clienteP3");
		clientesSemCompra3Meses.add("clienteP1");
		clientesSemCompra3Meses.add("clienteN1");
		clientesSemCompra3Meses.add("clienteN2");
		clientesSemCompra3Meses.add("clienteN4");
		clientesSemCompra3Meses.add("clienteN6");
		clientesSemCompra3Meses.add("clienteP5");
		clientesSemCompra3Meses.add("clienteN7");

		InterseccaoClientes obj = new InterseccaoClientes(clientesPremium, clientesSemCompra3Meses);

		if (obj.listaFinal.size() == 0) { System.out.println("Nenhum cliente comum entre as listas."); }
		else {
			System.out.println("Clientes nas listas:");
			for (String i : obj.listaFinal) System.out.println(i);
		}

		if (valida(obj.listaFinal, clientesPremium, clientesSemCompra3Meses)) System.out.println("Lista final validada!");
		else System.out.println("Lista não validada!");

	}

	static boolean valida(ArrayList<String> listaF, ArrayList<String> listaA, ArrayList<String> listaB) {

		int confirmadosA = 0;
		int confirmadosB = 0;
		
		for ( String i : listaF) {
			for (String j : listaA) { if (i == j) { confirmadosA++; break; } }
			for (String k : listaB) { if (i == k) { confirmadosB++; break; } }
		}

		if (confirmadosA == confirmadosB && confirmadosA != 0 && confirmadosB != 0) return true;
		else return false;

	}
}

class InterseccaoClientes {

	public ArrayList<String> listaFinal = new ArrayList<String>();

	public InterseccaoClientes(ArrayList<String> clientesPremium, ArrayList<String> clientesSemCompra3Meses) {

		for (String i : clientesPremium) {

			for (String j : clientesSemCompra3Meses) {

				if (i == j) { listaFinal.add(i); break; }
			}
		}
		Collections.sort(listaFinal);
	}
}
