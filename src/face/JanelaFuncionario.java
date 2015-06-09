package face;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.CtrlFuncionario;

public class JanelaFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JLabel lblCadastroDeFuncionarios;
	private JLabel lblNome;
	private JLabel lblData;
	private JLabel lblNewLabel;
	private JLabel lblEndereo;
	private JLabel lblNewLabel_1;
	private JTextField tfData;
	private JTextField tfTelefone;
	private JTextField tfEndereco;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JComboBox cbCargo;

	private CtrlFuncionario parente;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public JanelaFuncionario(CtrlFuncionario parente) {
		this.parente = parente;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTfNome());
		contentPane.add(getLblCadastroDeFuncionarios());
		contentPane.add(getLblNome());
		contentPane.add(getLblData());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblEndereo());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfData());
		contentPane.add(getTfTelefone());
		contentPane.add(getTfEndereco());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnVoltar());
		contentPane.add(getCbCargo());

		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	private JTextField getTfNome() {
		if (tfNome == null) {
			tfNome = new JTextField();
			tfNome.setBounds(106, 58, 234, 20);
			tfNome.setColumns(10);
		}
		return tfNome;
	}

	private JLabel getLblCadastroDeFuncionarios() {
		if (lblCadastroDeFuncionarios == null) {
			lblCadastroDeFuncionarios = new JLabel("Cadastro de Funcionarios");
			lblCadastroDeFuncionarios.setFont(new Font("Arial Black",
					Font.PLAIN, 15));
			lblCadastroDeFuncionarios.setBounds(106, 0, 221, 29);
		}
		return lblCadastroDeFuncionarios;
	}

	private JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome:");
			lblNome.setBounds(49, 60, 40, 17);
		}
		return lblNome;
	}

	private JLabel getLblData() {
		if (lblData == null) {
			lblData = new JLabel("Data:");
			lblData.setBounds(49, 88, 46, 20);
		}
		return lblData;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Telefone:");
			lblNewLabel.setBounds(49, 119, 70, 20);
		}
		return lblNewLabel;
	}

	private JLabel getLblEndereo() {
		if (lblEndereo == null) {
			lblEndereo = new JLabel("Endere\u00E7o:");
			lblEndereo.setBounds(49, 150, 63, 20);
		}
		return lblEndereo;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Fun\u00E7\u00E3o:");
			lblNewLabel_1.setBounds(49, 196, 46, 14);
		}
		return lblNewLabel_1;
	}

	private JTextField getTfData() {
		if (tfData == null) {
			tfData = new JTextField();
			tfData.setColumns(10);
			tfData.setBounds(106, 89, 234, 20);
		}
		return tfData;
	}

	private JTextField getTfTelefone() {
		if (tfTelefone == null) {
			tfTelefone = new JTextField();
			tfTelefone.setColumns(10);
			tfTelefone.setBounds(106, 119, 234, 20);
		}
		return tfTelefone;
	}

	private JTextField getTfEndereco() {
		if (tfEndereco == null) {
			tfEndereco = new JTextField();
			tfEndereco.setColumns(10);
			tfEndereco.setBounds(106, 150, 234, 20);
		}
		return tfEndereco;
	}

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String nome = tfNome.getText();

					String data = tfData.getText();
					String telefone = tfData.getText();
					String endereco = tfEndereco.getText();
					String msg = "";

					if (cbCargo.getSelectedItem().equals("Atendente")) {
						msg = parente.inserirFuncionario(nome, data, telefone,
								endereco, "Atendente");

					} else if (cbCargo.getSelectedItem().equals("Entregador")) {
						msg = parente.inserirFuncionario(nome, data, telefone,
								endereco, "Entregador");

					} else if (cbCargo.equals("Cozinheiro")) {
						msg = parente.inserirFuncionario(nome, data, telefone,
								endereco, "Cozinheiro");

					} else if (cbCargo.getSelectedItem().equals("Garçom")) {
						msg = parente.inserirFuncionario(nome, data, telefone,
								endereco, "Garçom");

					}
					JOptionPane.showMessageDialog(null, msg);
				}
			});
			btnCadastrar.setBounds(106, 238, 96, 23);
		}
		return btnCadastrar;
	}

	private JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("Voltar");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					parente.Voltar();
					dispose();

				}
			});
			btnVoltar.setBounds(212, 238, 89, 23);
		}
		return btnVoltar;
	}

	private JComboBox getCbCargo() {
		if (cbCargo == null) {
			cbCargo = new JComboBox();
			cbCargo.setModel(new DefaultComboBoxModel(new String[] {
					"Atendente", "Entregador", "Cozinheiro", "Garçom" }));
			cbCargo.setBounds(110, 192, 92, 23);
		}
		return cbCargo;
	}
}
