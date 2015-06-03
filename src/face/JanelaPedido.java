package face;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class JanelaPedido extends JFrame {

	private JPanel contentPane;
	private JLabel lblCadastroDePedido;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JanelaHome parente;
	private JRadioButton rdbtnInterno;
	private JRadioButton rdbtnExterno;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public JanelaPedido(JanelaHome parente) {
		this.parente = parente;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblCadastroDePedido());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnVoltar());
		contentPane.add(getRdbtnInterno());
		contentPane.add(getRdbtnExterno());
		
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	private JLabel getLblCadastroDePedido() {
		if (lblCadastroDePedido == null) {
			lblCadastroDePedido = new JLabel("Cadastro de Pedido");
			lblCadastroDePedido.setFont(new Font("Arial Black",
					Font.PLAIN, 15));
			lblCadastroDePedido.setBounds(106, 11, 221, 29);
		}
		return lblCadastroDePedido;
	}

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {					}

				}
			);
			btnCadastrar.setBounds(106, 238, 96, 23);
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
			btnVoltar.setBounds(212, 238, 89, 23);
		}
		return btnVoltar;
	}
	private JRadioButton getRdbtnInterno() {
		if (rdbtnInterno == null) {
			rdbtnInterno = new JRadioButton("Interno");
			rdbtnInterno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(getRdbtnInterno().isSelected())
						getRdbtnExterno().setSelected(false);
				}
			});
			rdbtnInterno.setSelected(true);
			rdbtnInterno.setBounds(22, 57, 109, 23);
		}
		return rdbtnInterno;
	}
	private JRadioButton getRdbtnExterno() {
		if (rdbtnExterno == null) {
			rdbtnExterno = new JRadioButton("Externo");
			rdbtnExterno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(getRdbtnExterno().isSelected())
						getRdbtnInterno().setSelected(false);
				}
			});
			
			rdbtnExterno.setBounds(233, 57, 109, 23);
		}
		return rdbtnExterno;
	}
}
