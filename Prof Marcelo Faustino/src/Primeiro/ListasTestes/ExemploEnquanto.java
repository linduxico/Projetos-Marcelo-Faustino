package ListasTestes;
import java.util.Scanner;

public class ExemploEnquanto {

	public static void main(String[] args) {
		
		int num, cont = 1;
		Scanner leia = new Scanner(System.in);
		
		while (cont <= 5) {
			System.out.print("Digite o " + cont + "� n�: ");
			num = leia.nextInt();
			System.out.println("O " + cont + "� n� = " + num);
			//cont = cont + 1; // Vari�vel Acumuladora
			cont++;
		}
		System.out.println("Fim do Programa");
	}
	
}
