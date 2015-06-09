package controle;

import face.JanelaHome;

public class Programa {
	

	private CtrlFuncionario ctrlFuncionario;
	private CtrlClientes ctrlClientes;
	private CtrlFornecedores ctrlFornecedores;
	private CtrlPedidos ctrlPedidos;
	private CtrlProdutos ctrlProdutos;
	
	public Programa(){
		JanelaHome frame = new JanelaHome(this);
		frame.setVisible(true);
		ctrlClientes = new CtrlClientes(this);
		ctrlFornecedores = new CtrlFornecedores(this);
		ctrlFuncionario = new CtrlFuncionario(this);
		ctrlProdutos = new CtrlProdutos(this);
	}
	
	public static void main(String[] args) {
		new Programa();
	}
	
	public void Voltar(){
		JanelaHome frame = new JanelaHome(this);
		frame.setVisible(true);
	}
	
	public void AbrirCliente(){
		ctrlClientes.AbrirJanela();
	}
	
	public void AbrirFornecedor(){
		ctrlFornecedores.AbrirJanela();
	}
	
	public void AbrirFuncionario(){
		ctrlFuncionario.AbrirJanela();
	}
	
	public void AbrirProduto(){
		ctrlProdutos.AbrirJanela();
	}
	
	public CtrlFornecedores getCtrlFornecedores(){
		return ctrlFornecedores;
	}
}
