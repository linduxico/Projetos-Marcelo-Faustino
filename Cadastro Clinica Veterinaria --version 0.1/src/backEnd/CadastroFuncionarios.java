package backEnd;

import java.util.ArrayList;

public class CadastroFuncionarios {
	private int id;
	private String nome;
	private int anoNasc;
	private String senha;
	//privilegio 1 = adm, 0 = normal !!
	private int acesso = 0;
	private ArrayList<CadastroFuncionarios>lista= new ArrayList<CadastroFuncionarios>();;
	
	
	public ArrayList<CadastroFuncionarios> getLista() {
		return lista;
	}

	public void setLista(ArrayList<CadastroFuncionarios> lista) {
		this.lista = lista;
	}

	public CadastroFuncionarios() {
		
	}
	
	public CadastroFuncionarios(String nome, int anoNasc, String senha, int acesso) {
		super();
		this.id += id++;
		this.acesso = acesso;
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.senha = senha;
	}
	public CadastroFuncionarios(String nome, int anoNasc, String senha) {
		super();
		this.id += id++;
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.senha = senha;
	}
	public int getAcesso() {
		return acesso;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
}
