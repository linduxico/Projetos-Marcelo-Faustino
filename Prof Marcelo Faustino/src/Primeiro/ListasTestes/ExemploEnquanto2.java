package ListasTestes;
import java.util.Scanner;

public class ExemploEnquanto2 {

	public static void main(String[] args) {
		
		int cont = 1, num; // opcao = vari�vel flag
		Boolean opcao;
		Scanner leia = new Scanner(System.in);
		
		// while = enquanto
		while (opcao = true) {
			System.out.print("Digite o " + cont + "� n�: ");
			num = leia.nextInt();
			System.out.println("O " + cont + "� n� = " + num);
			//cont = cont + 1; // Vari�vel Acumuladora
			cont++;
			
			System.out.print("Deseja continuar (s/n): ");
			opcao = leia.nextBoolean();
		}
		System.out.println("Fim do Programa");
	}
	
}
