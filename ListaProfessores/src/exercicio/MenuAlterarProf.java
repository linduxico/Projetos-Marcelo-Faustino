package exercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MenuAlterarProf {
	ArrayList<Professores> listprof = new ArrayList<Professores>();
	Professores prof;
	public Professores menuAlterarProf(ArrayList<Professores> tamanho,int posArray,Professores posicao) {
		prof = new Professores();
		listprof.addAll(tamanho);
		listprof.get(posArray);
		prof.setNome(JOptionPane.showInputDialog("Altere o nome do prof de: " + (posicao.getNome()) + " Para: "),
				posArray + 1);
		prof.setDisciplina(JOptionPane.showInputDialog("Altere a Disciplina que o " + prof.getNome() + " domina."));
		prof.setFormacao(JOptionPane.showInputDialog("Altere Qual a formação do " + prof.getNome()));
		prof.setPeriodo(Integer.parseInt(JOptionPane.showInputDialog(
				"Altere o periodo em que o " + prof.getNome() + " esta na materia " + prof.getDisciplina())));
		return prof;
	}
}
