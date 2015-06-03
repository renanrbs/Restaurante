package controle;

import face.JanelaHome;


public class Programa {
	public static void main(String[] args) {

	
		JanelaHome frame = new JanelaHome();
		frame.setVisible(true);
		
		
		
		/*CtrlFuncionario ctrlFuncionario = new CtrlFuncionario();
		CtrlClientes ctrlClientes = new CtrlClientes();
		CtrlFornecedores ctrlFornecedores = new CtrlFornecedores();
		CtrlPedidos ctrlPedidos = new CtrlPedidos();
		CtrlProdutos ctrlProdutos = new CtrlProdutos();
		CtrlMesa ctrlMesa = new CtrlMesa();

		ctrlFuncionario.inserirFuncionario('c', "Maria", 1, "01/06/1980",
				"3256-8656", "rua 8", "cozinheiro");
		ctrlFuncionario.inserirFuncionario('e', "Leonardo", 2, "03/04/1988",
				"2353-6865", "rua 2", "entregador");
		ctrlFuncionario.inserirFuncionario('a', "Claudia", 3, "04/11/1979",
				"6566-6566", "rua 1", "atendente");
		ctrlFuncionario.inserirFuncionario('g', "Vitor", 4, "21/10/1900",
				"8582-1462", "Rua C#", "garçom");

		ctrlClientes.inserirCliente(1, "Luciano", "2353-6565", "rua 20");

		ctrlMesa.inserirMesa(1);

		ctrlFornecedores.inserirFornecedor(1, "biscoito", "3235-6565", "rua 7");

		ctrlProdutos.inserirPrato(1, "Pizza", 20f, false,
				ctrlFornecedores.getFornecedor(1));
		ctrlProdutos.inserirBebida(2, "Pepsi", 5f, "05/03/2015",
				ctrlFornecedores.getFornecedor(1));

		ctrlPedidos.inserirPedidoEx(1, ctrlClientes.getCliente(1),
				ctrlFuncionario.getFuncionario(1),
				ctrlFuncionario.getFuncionario(2),
				ctrlFuncionario.getFuncionario(3));

		ctrlPedidos.inserirPedidoIn(2, ctrlFuncionario.getFuncionario(1),
				ctrlMesa.getMesa(1), ctrlFuncionario.getFuncionario(4));

		ctrlPedidos.getPedido(1).InserirProduto(ctrlProdutos.getProduto(1));
		ctrlPedidos.getPedido(1).InserirProduto(ctrlProdutos.getProduto(2));

		ctrlPedidos.getPedido(2).InserirProduto(ctrlProdutos.getProduto(1));
		ctrlPedidos.getPedido(2).InserirProduto(ctrlProdutos.getProduto(2));

		System.out.println("Prato 1 fornecedor "
				+ ctrlProdutos.getProduto(1).getFornecedor().getNome());

		System.out.println("pedido 1 contém:\n"
				+ ctrlPedidos.getPedido(1).getProdutos());

		System.out.println("Cliente : "
				+ ctrlPedidos.getPedido(1).getCliente().getNome());

		System.out.println("Cozinheiro: "
				+ ctrlPedidos.getPedido(1).getCozinheiro().getNome());

		System.out.println("Entregador: "
				+ ctrlPedidos.getPedido(1).getEntregador().getNome());

		System.out.println("Atendente : "
				+ ctrlPedidos.getPedido(1).getAtendente().getNome());

		System.out.printf("preço: R$ %.2f \n", ctrlPedidos.getPedido(1)
				.calcularPreço());

		System.out.println("pedido 2 contém:\n"
				+ ctrlPedidos.getPedido(2).getProdutos());

		System.out.println("Cozinheiro: "
				+ ctrlPedidos.getPedido(2).getCozinheiro().getNome());

		System.out.println("Garçom : "
				+ ctrlPedidos.getPedido(2).getGarçom().getNome());

		System.out.println("Mesa : "
				+ ctrlPedidos.getPedido(2).getMesa().getNumero());

		System.out.printf("preço: R$ %.2f", ctrlPedidos.getPedido(1)
				.calcularPreço());*/

	}
}
