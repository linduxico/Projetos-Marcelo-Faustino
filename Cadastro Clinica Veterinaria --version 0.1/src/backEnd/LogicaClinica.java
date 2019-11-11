package backEnd;

import javax.swing.JOptionPane;

public class LogicaClinica {

	public boolean retornapergunta(String question) {
		String verdadeirooufalso = "";
		boolean resposta = false;
		verdadeirooufalso = JOptionPane.showInputDialog(null, question);
		if (verdadeirooufalso.equalsIgnoreCase("Sim")) {
			return resposta = true;
		} else {
			return resposta;
		}

	}
}