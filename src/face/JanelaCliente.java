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

public class JanelaCliente extends JFrame {

	private JPanel contentPane;
	private JLabel lblCadastroDeClientes;
	private JLabel lblCdigo;
	private JLabel lblNome;
	private JLabel lblTelefone;
	private JLabel lblEndereo;
	private JTextField tfCod;
	private JTextField tfNome;
	private JTextField tfTelefone;
	private JTextField tfEndereço;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JanelaHome parente;

	public JanelaCliente(JanelaHome parente) {
		this.parente = parente;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblCadastroDeClientes());
		contentPane.add(getLblCdigo());
		contentPane.add(getLblNome());
		contentPane.add(getLblTelefone());
		contentPane.add(getLblEndereo());
		contentPane.add(getTfCod());
		contentPane.add(getTfNome());
		contentPane.add(getTfTelefone());
		contentPane.add(getTfEndereço());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnVoltar());
	}

	private JLabel getLblCadastroDeClientes() {
		if (lblCadastroDeClientes == null) {
			lblCadastroDeClientes = new JLabel("Cadastro de Clientes");
			lblCadastroDeClientes.setFont(new Font("Arial Black", Font.PLAIN,
					15));
			lblCadastroDeClientes.setBounds(113, 11, 212, 63);
		}
		return lblCadastroDeClientes;
	}

	private JLabel getLblCdigo() {
		if (lblCdigo == null) {
			lblCdigo = new JLabel("C\u00F3digo: ");
			lblCdigo.setBounds(32, 70, 46, 14);
		}
		return lblCdigo;
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
			lblTelefone.setBounds(32, 130, 88, 14);
		}
		return lblTelefone;
	}

	private JLabel getLblEndereo() {
		if (lblEndereo == null) {
			lblEndereo = new JLabel("Endere\u00E7o:");
			lblEndereo.setBounds(32, 160, 88, 14);
		}
		return lblEndereo;
	}

	private JTextField getTfCod() {
		if (tfCod == null) {
			tfCod = new JTextField();
			tfCod.setBounds(97, 70, 327, 20);
			tfCod.setColumns(10);
		}
		return tfCod;
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

	private JTextField getTfEndereço() {
		if (tfEndereço == null) {
			tfEndereço = new JTextField();
			tfEndereço.setBounds(97, 160, 327, 20);
			tfEndereço.setColumns(10);
		}
		return tfEndereço;
	}

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int codigo = Integer.parseInt(getTfCod().getText());
					String nome = getTfNome().getText();
					String telefone = getTfTelefone().getText();
					String endereço = getTfEndereço().getText();
					
					JOptionPane.showMessageDialog(
							null,
							parente.getCtrlClientes().inserirCliente(codigo,nome, telefone, endereço));
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
