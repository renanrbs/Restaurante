package face;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaMesa extends JFrame {

	private JPanel contentPane;
	private JLabel lblCadastrarMesa;
	private JLabel lblNmero;
	private JTextField tfNum;
	private JButton btnCadastrar;
	private JButton btnVoltar;
	private JanelaHome parente;
	

	public JanelaMesa(JanelaHome parente) {
		this.parente = parente;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblCadastrarMesa());
		contentPane.add(getLblNmero());
		contentPane.add(getTfNum());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnVoltar());
	}
	private JLabel getLblCadastrarMesa() {
		if (lblCadastrarMesa == null) {
			lblCadastrarMesa = new JLabel("Cadastro de Mesas");
			lblCadastrarMesa.setFont(new Font("Arial Black", Font.PLAIN, 15));
			lblCadastrarMesa.setBounds(126, 11, 212, 63);
		}
		return lblCadastrarMesa;
	}
	private JLabel getLblNmero() {
		if (lblNmero == null) {
			lblNmero = new JLabel("N\u00FAmero:");
			lblNmero.setBounds(46, 87, 80, 14);
		}
		return lblNmero;
	}
	private JTextField getTfNum() {
		if (tfNum == null) {
			tfNum = new JTextField();
			tfNum.setBounds(107, 85, 86, 20);
			tfNum.setColumns(10);
		}
		return tfNum;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int numero = Integer.parseInt(getTfNum().getText());
					JOptionPane.showMessageDialog(null, parente.getCtrlMesa().inserirMesa(numero));
				}
			});
			btnCadastrar.setBounds(154, 180, 106, 23);
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
			btnVoltar.setBounds(154, 214, 106, 23);
		}
		return btnVoltar;
	}
}
