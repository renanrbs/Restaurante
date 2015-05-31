package dominio;

public class Interno extends Pedido {
	private Funcionario garçom;
	private Mesa mesa;

	public Interno(int codigo, Funcionario cozinheiro, Mesa mesa, Funcionario garçom) {
		super(codigo, cozinheiro);
		this.mesa = mesa;
		this.garçom = garçom;
	}

	public void setGarçom(Funcionario garçom) {
		this.garçom = garçom;
	}

	@Override
	public Funcionario getGarçom() {
		return garçom;
	}

	@Override
	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
}
