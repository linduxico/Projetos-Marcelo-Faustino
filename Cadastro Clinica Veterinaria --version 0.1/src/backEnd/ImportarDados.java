package backEnd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ImportarDados {
	public void gravarArquivo(ArrayList<CadastroAnimal> lista, String locarq, String nomearq, boolean criarNovoArq) throws IOException {
		FileWriter fw = new FileWriter(locarq + nomearq, criarNovoArq);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < lista.size(); i++) {
	     bw.write(lista.get(i).getNome()+",");
	     bw.write(lista.get(i).getTipo()+",");
	     bw.write(lista.get(i).getRaca()+",");
	     bw.write(lista.get(i).getCor()+",");
	     bw.write(lista.get(i).getPeso()+",");
	     bw.write(lista.get(i).getAltura()+"");
	     bw.write(lista.get(i).getAnoNasc()+",");
		}
		//bw.write(conteudo + "\n");
		if(!criarNovoArq) {
			JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Arquivo Subscrito e salvo com sucesso!");
		}
		bw.close();
		fw.close();
	}
	public ArrayList<CadastroAnimal> lerArquivo(String nomearq) throws FileNotFoundException, IOException {
		//GravarArquivo gv = new GravarArquivo();
		ArrayList<CadastroAnimal> listprof = new ArrayList<CadastroAnimal>();
		FileReader fr = new FileReader(nomearq);
		BufferedReader br = new BufferedReader(fr);
		CadastroAnimal novoanimal = new CadastroAnimal();
		String linha;
		int i = 0;
		while (br.ready()) {
			linha = br.readLine();
			if (linha.length() > 10) {
				
				
			}
			i++;
		}
		br.close();
		fr.close();
		JOptionPane.showMessageDialog(null, "Leitura realizada com sucesso, fique a vontade para desfrutar.");
		return listprof;
	}
}
