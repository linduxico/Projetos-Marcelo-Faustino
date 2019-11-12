package backEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import painelCentral.TelaPrincipal;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaExcluir extends JFrame {

	private JPanel contentPane;

	public TelaExcluir(ArrayList<CadastroAnimal> lista, String nome) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				TelaPrincipal tela = new TelaPrincipal(nome, lista);
				setBounds(100, 100, 747, 598);
				tela.setVisible(true);
			}
		});
		setTitle("Clina Veterinaria Animal Sensation");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 392, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);

		JButton btnAlterar = new JButton("Excluir Tudo");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lista.clear();
				JOptionPane.showMessageDialog(null, "Foi excluida toda a lista de dados !!");
			}
		});
		btnAlterar.setBounds(44, 69, 137, 35);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir Separadamente");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarCadastros listar = new ListarCadastros(nome, lista);
				listar.setVisible(true);
				int op = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Escolha na lista qual o id deseja Excluir !!"));
				JOptionPane.showMessageDialog(null, lista.get((op-1)).getNome()+" Foi Excluido com sucesso !!");
				lista.remove((op-1));
				listar.setVisible(false);
				dispose();
			}
		});
		btnExcluir.setBounds(191, 69, 137, 35);
		contentPane.add(btnExcluir);

	}

}
