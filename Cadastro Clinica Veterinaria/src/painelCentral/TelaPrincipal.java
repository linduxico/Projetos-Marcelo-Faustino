package painelCentral;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backEnd.CadastroAnimal;
import backEnd.ListarCadastros;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private ArrayList<CadastroAnimal> lista;
	private static TelaPrincipal frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaPrincipal(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TelaPrincipal(String nome) {
		setTitle("Clina Veterinaria Animal Sensation");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 892, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(101, 200, 162, 71);
		contentPane.add(btnCadastrar);
		
		JLabel lblTelaBoasVindas = new JLabel("");
		lblTelaBoasVindas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelaBoasVindas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaBoasVindas.setForeground(Color.GREEN);
		lblTelaBoasVindas.setBounds(10, 23, 858, 54);
		contentPane.add(lblTelaBoasVindas);
		lblTelaBoasVindas.setText(nome+" Seja Bem Vindo(a)!! ");
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(310, 200, 162, 71);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(526, 200, 162, 71);
		contentPane.add(btnExcluir);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarCadastros listar = new ListarCadastros(lista,nome);
				listar.setVisible(true);
				listar.requestFocus();
				dispose();
			}
		});
		btnListar.setBounds(101, 314, 162, 71);
		contentPane.add(btnListar);
		
		JButton btnGravardados = new JButton("Gravar Dados");
		btnGravardados.setBounds(310, 314, 162, 71);
		contentPane.add(btnGravardados);
		
		JButton btnImportardados = new JButton("Importar Dados");
		btnImportardados.setBounds(526, 314, 162, 71);
		contentPane.add(btnImportardados);
		
		JButton btnSelecionarPasta = new JButton("Selecionar Pasta");
		btnSelecionarPasta.setBounds(310, 432, 162, 71);
		contentPane.add(btnSelecionarPasta);
	}
}
