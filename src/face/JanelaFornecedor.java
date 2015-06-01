package face;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JanelaFornecedor extends JFrame {

	private JPanel contentPane;
	private JLabel lblCadastroDeFornecedores;
	private JLabel lblNome;
	private JLabel lblTelefone;
	private JLabel lblEndereco;
	private JTextField tfNome;
	private JTextField tfTelefone;
	private JTextField tfEndereco;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JanelaHome parente;

	public JanelaFornecedor(JanelaHome parente) {
		this.parente = parente;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblCadastroDeFornecedores());
		contentPane.add(getLblNome());
		contentPane.add(getLblTelefone());
		contentPane.add(getLblEndereco());
		contentPane.add(getTfNome());
		contentPane.add(getTfTelefone());
		contentPane.add(getTfEndereco());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnVoltar());
		
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	private JLabel getLblCadastroDeFornecedores() {
		if (lblCadastroDeFornecedores == null) {
			lblCadastroDeFornecedores = new JLabel("Cadastro de Fornecedores");
			lblCadastroDeFornecedores.setFont(new Font("Arial Black", Font.PLAIN,
					15));
			lblCadastroDeFornecedores.setBounds(113, 11, 227, 63);
		}
		return lblCadastroDeFornecedores;
	}

	private JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome: ");
			lblNome.setBounds(32, 100, 46, 14);
		}
		return lblNome;
	}

	private JLabel getLblTelefone() {
		if (lblTelefone == null) {
			lblTelefone = new JLabel("Telefone: ");
			lblTelefone.setBounds(32, 133, 88, 14);
		}
		return lblTelefone;
	}

	private JLabel getLblEndereco() {
		if (lblEndereco == null) {
			lblEndereco = new JLabel("Endere\u00E7o:");
			lblEndereco.setBounds(32, 160, 88, 14);
		}
		return lblEndereco;
	}

	private JTextField getTfNome() {
		if (tfNome == null) {
			tfNome = new JTextField();
			tfNome.setBounds(97, 100, 327, 20);
			tfNome.setColumns(10);
		}
		return tfNome;
	}

	private JTextField getTfTelefone() {
		if (tfTelefone == null) {
			tfTelefone = new JTextField();
			tfTelefone.setBounds(97, 130, 327, 20);
			tfTelefone.setColumns(10);
		}
		return tfTelefone;
	}

	private JTextField getTfEndereco() {
		if (tfEndereco == null) {
			tfEndereco = new JTextField();
			tfEndereco.setBounds(97, 160, 327, 20);
			tfEndereco.setColumns(10);
		}
		return tfEndereco;
	}

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String nome = getTfNome().getText();
					String telefone = getTfTelefone().getText();
					String endereço = getTfEndereco().getText();
					
					JOptionPane.showMessageDialog(
							null,
							parente.getCtrlFornecedores().inserirFornecedor(nome, telefone, endereço));
				}
			});
			btnCadastrar.setBounds(159, 194, 106, 23);
		}
		return btnCadastrar;
	}

	private JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("Voltar");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JanelaHome janela = parente;
					janela.setVisible(true);
					dispose();
				}
			});
			btnVoltar.setBounds(159, 228, 106, 23);
		}
		return btnVoltar;
	}
}