package exercicio;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Listar {
	ArrayList<Professores>listprof = new ArrayList<Professores>();
	public String listar(ArrayList<Professores>tamanho) {
		int i = 0;
		String total = "Lista Prof";
		listprof.addAll(tamanho);
		while (i < listprof.size()) {
			// JOptionPane.showMessageDialog(null, listprof.get(i));
			total = total + "\n" + listprof.get(i);
			i++;
		}
		JOptionPane.showMessageDialog(null, total);
		return total;
	}
}
