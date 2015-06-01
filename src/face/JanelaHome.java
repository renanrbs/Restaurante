package face;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.CtrlClientes;
import controle.CtrlFornecedores;
import controle.CtrlFuncionario;
import controle.CtrlMesa;
import controle.CtrlPedidos;
import controle.CtrlProdutos;

public class JanelaHome extends JFrame {

	private JPanel contentPane;
	private JLabel lblEscolha;
	private JButton btnCadastrarCliente;
	private JButton btnCadastrarFornecedor;
	private JButton btnCadastrarFuncionario;
	private JButton btnCadastrarPedido;
	private JButton btnCadastrarProduto;

	private CtrlFuncionario ctrlFuncionario;
	private CtrlClientes ctrlClientes;
	private CtrlFornecedores ctrlFornecedores;
	private CtrlPedidos ctrlPedidos;
	private CtrlProdutos ctrlProdutos;
	private CtrlMesa ctrlMesa;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public JanelaHome() {
		ctrlFuncionario = new CtrlFuncionario();
		ctrlClientes = new CtrlClientes();
		ctrlFornecedores = new CtrlFornecedores();
		ctrlPedidos = new CtrlPedidos();
		ctrlProdutos = new CtrlProdutos();
		ctrlMesa = new CtrlMesa();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblEscolha());
		contentPane.add(getBtnCadastrarCliente());
		contentPane.add(getBtnCadastrarFornecedor());
		contentPane.add(getBtnCadastrarPedido());
		contentPane.add(getBtnCadastrarFuncionario());
		contentPane.add(getBtnCadastrarProduto());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		
	
	}

	public CtrlFuncionario getCtrlFuncionario() {
		return ctrlFuncionario;
	}

	public CtrlClientes getCtrlClientes() {
		return ctrlClientes;
	}

	public CtrlFornecedores getCtrlFornecedores() {
		return ctrlFornecedores;
	}

	public CtrlPedidos getCtrlPedidos() {
		return ctrlPedidos;
	}

	public CtrlProdutos getCtrlProdutos() {
		return ctrlProdutos;
	}

	public CtrlMesa getCtrlMesa() {
		return ctrlMesa;
	}

	private JLabel getLblEscolha() {
		if (lblEscolha == null) {
			lblEscolha = new JLabel("Escolha uma op\u00E7\u00E3o");
			lblEscolha.setBounds(146, 5, 212, 63);
			lblEscolha.setFont(new Font("Arial Black", Font.PLAIN, 15));
		}
		return lblEscolha;
	}

	private JButton getBtnCadastrarCliente() {
		if (btnCadastrarCliente == null) {
			btnCadastrarCliente = new JButton("Cadastrar Cliente");
			btnCadastrarCliente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JanelaCliente janela = new JanelaCliente(JanelaHome.this);
					janela.setVisible(true);
					dispose();
				}
			});
			btnCadastrarCliente.setBounds(217, 131, 212, 63);
		}
		return btnCadastrarCliente;
	}

	private JButton getBtnCadastrarFornecedor() {
		if (btnCadastrarFornecedor == null) {
			btnCadastrarFornecedor = new JButton("Cadastrar Fornecedor");
			btnCadastrarFornecedor.setBounds(5, 131, 212, 63);
			btnCadastrarFornecedor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JanelaFornecedor janela = new JanelaFornecedor(JanelaHome.this);
					janela.setVisible(true);
					dispose();
				}
			});
		}
		return btnCadastrarFornecedor;
	}

	private JButton getBtnCadastrarFuncionario() {
		if (btnCadastrarFuncionario == null) {
			btnCadastrarFuncionario = new JButton("Cadastrar Funcionario");
			btnCadastrarFuncionario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JanelaFuncionario janela = new JanelaFuncionario(JanelaHome.this);
					janela.setVisible(true);
					dispose();
				}
			});
			btnCadastrarFuncionario.setBounds(5, 194, 212, 63);
		}
		return btnCadastrarFuncionario;
	}

	private JButton getBtnCadastrarPedido() {
		if (btnCadastrarPedido == null) {
			btnCadastrarPedido = new JButton("Cadastrar Pedido");
			btnCadastrarPedido.setBounds(107, 67, 212, 63);
		}
		return btnCadastrarPedido;
	}

	private JButton getBtnCadastrarProduto() {
		if (btnCadastrarProduto == null) {
			btnCadastrarProduto = new JButton("Cadastrar Produto");
			btnCadastrarProduto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JanelaProduto janela = new JanelaProduto(JanelaHome.this);
					janela.setVisible(true);
					dispose();
				}
			});
			btnCadastrarProduto.setBounds(217, 194, 212, 63);
		}
		return btnCadastrarProduto;
	}
}
