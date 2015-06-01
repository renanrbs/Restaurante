package controle;

import dominio.Cliente;
import dominio.Externo;
import dominio.Funcionario;
import dominio.Interno;
import dominio.Mesa;
import dominio.Pedido;

public class CtrlPedidos{
	private Pedido[] vetorP;

	public CtrlPedidos() {
		vetorP = new Pedido[3];
	}

	public String inserirPedidoEx( Cliente cliente,
			Funcionario cozinheiro, Funcionario entregador,
			Funcionario atendente) {
		int i;
		for (i = 0; i < vetorP.length; i++) {
			if (vetorP[i] == null)
				break;
		}
		if (i >= vetorP.length)
			return "Vetor de Pedidos lotado";

		vetorP[i] = new Externo( cliente, cozinheiro, entregador,
				atendente);

		return "Pedido Inserido";
	}

	public String inserirPedidoIn(Funcionario cozinheiro,
			Mesa mesa, Funcionario garçom) {
		int i;
		for (i = 0; i < vetorP.length; i++) {
			if (vetorP[i] == null)
				break;
		}
		if (i >= vetorP.length)
			return "Vetor de Pedidos lotado";

		vetorP[i] = new Interno( cozinheiro, mesa, garçom);

		return "Pedido Inserido";
	}

	public Pedido getPedido(int codigo) {
		for (int i = 0; i < vetorP.length; i++) {
			if (vetorP[i] != null) {
				if (vetorP[i].getCodigo() == codigo)
					return vetorP[i];
			}
		}
		return null;
	}

}
