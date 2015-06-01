package face;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.CtrlFornecedores;
import dominio.Fornecedor;

public class JanelaProduto extends JFrame {

	private JPanel contentPane;
	private JLabel lblCadastroDeProdutos;
	private JLabel lblCdigo;
	private JLabel lblNome;
	private JLabel lblPreço;
	private JTextField tfCod;
	private JTextField tfNome;
	private JTextField tfTelefone;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JanelaHome parente;
	private JRadioButton rdSobremesa;
	private JLabel lblFornecedor;
	private JComboBox cbFornecedor;

	public JanelaProduto(JanelaHome parente) {
		this.parente = parente;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblCadastroDeProdutos());
		contentPane.add(getLblCdigo());
		contentPane.add(getLblNome());
		contentPane.add(getLblPreço());
		contentPane.add(getTfCod());
		contentPane.add(getTfNome());
		contentPane.add(getTfTelefone());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnVoltar());
		contentPane.add(getRdSobremesa());
		contentPane.add(getLblFornecedor());
		contentPane.add(getCbFornecedor());
		this.setLocationRelativeTo(null);
	}

	private JLabel getLblCadastroDeProdutos() {
		if (lblCadastroDeProdutos == null) {
			lblCadastroDeProdutos = new JLabel("Cadastro de Produtos");
			lblCadastroDeProdutos.setFont(new Font("Arial Black", Font.PLAIN,
					15));
			lblCadastroDeProdutos.setBounds(113, 11, 212, 63);
		}
		return lblCadastroDeProdutos;
	}

	private JLabel getLblCdigo() {
		if (lblCdigo == null) {
			lblCdigo = new JLabel("C\u00F3digo: ");
			lblCdigo.setBounds(32, 70, 69, 14);
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

	private JLabel getLblPreço() {
		if (lblPreço == null) {
			lblPreço = new JLabel("Pre\u00E7o: ");
			lblPreço.setBounds(32, 130, 106, 14);
		}
		return lblPreço;
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

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int codigo = Integer.parseInt(getTfCod().getText());
					String nome = getTfNome().getText();
					float preço = Float.parseFloat(getTfTelefone().getText());
					boolean esobremesa = Boolean.parseBoolean(getRdSobremesa().getText());
					Fornecedor fornecedor = parente.getCtrlFornecedores().getFornecedor(getCbFornecedor().getSelectedIndex());
					
										
					JOptionPane.showMessageDialog(
							null,
							parente.getCtrlProdutos().inserirPrato(codigo,nome, preço, esobremesa, fornecedor));
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
	private JRadioButton getRdSobremesa() {
		if (rdSobremesa == null) {
			rdSobremesa = new JRadioButton("Sobremesa");
			rdSobremesa.setBounds(32, 164, 96, 20);
		}
		return rdSobremesa;
	}
	private JLabel getLblFornecedor() {
		if (lblFornecedor == null) {
			lblFornecedor = new JLabel("Fornecedor:");
			lblFornecedor.setBounds(172, 163, 81, 16);
		}
		return lblFornecedor;
	}
	private JComboBox getCbFornecedor() {
		int i;
		if (cbFornecedor == null) {
			cbFornecedor = new JComboBox();
			cbFornecedor.setBounds(252, 163, 129, 22);
			 
			for (i=0; i < parente.getCtrlFornecedores().getTVetorF(); i++){
				if(parente.getCtrlFornecedores().getFornecedor(i) != null){
				cbFornecedor.addItem(parente.getCtrlFornecedores().getFornecedor(i).getNome());
				
				}
			}
			

		}
		return cbFornecedor;
	}
}
