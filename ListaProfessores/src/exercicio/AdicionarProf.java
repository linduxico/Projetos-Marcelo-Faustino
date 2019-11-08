package exercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class AdicionarProf {
	ArrayList<Professores> listprof = new ArrayList<Professores>();
	Professores prof;

	public Professores adicionarProf(ArrayList<Professores> tamanho) {
		prof = new Professores();
		listprof.addAll(tamanho);
		prof.setNome(JOptionPane.showInputDialog("Insira o nome do prof."), listprof.size() + 1);
		prof.setDisciplina(JOptionPane.showInputDialog("Insira a Disciplina que o " + prof.getNome() + " domina."));
		prof.setFormacao(JOptionPane.showInputDialog("Defina Qual a formação do " + prof.getNome()));
		prof.setPeriodo(Integer.parseInt(JOptionPane.showInputDialog(
				"Insira o periodo em que o " + prof.getNome() + " esta na materia " + prof.getDisciplina())));
		return prof;
	}
}
