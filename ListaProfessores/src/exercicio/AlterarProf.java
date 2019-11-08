package exercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AlterarProf {
	ArrayList<Professores> listprof = new ArrayList<Professores>();
	MenuAlterarProf menuAlterarProf = new MenuAlterarProf();
	Listar listar = new Listar();
	private int op;
	
	public int getOp() {
		return op;
	}
	public void setOp(int op) {
		this.op = op-1;
	}
	public Professores alterarProf(ArrayList<Professores> tamanho) {
		listprof.addAll(tamanho);
		JOptionPane.showMessageDialog(null, "Escolha na lista o id a ser alterado !!");
		listar.listar(listprof);
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Passe o parametro do ID do prof: "));
		 setOp(op);
		 Professores alterar = menuAlterarProf.menuAlterarProf(listprof, getOp(), listprof.get(getOp()));
		return alterar;
	}
}
