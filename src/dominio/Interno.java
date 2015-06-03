package dominio;

public class Interno extends Pedido {
	private Garçom Garçom;
	private Mesa mesa;

	public Interno(Cozinheiro cozinheiro, Mesa mesa, Garçom Garçom) {
		super(cozinheiro);
		this.mesa = mesa;
		this.Garçom = Garçom;
	}

	public void setGarçom(Garçom Garçom) {
		this.Garçom = Garçom;
	}

	@Override
	public Garçom getGarçom() {
		return Garçom;
	}

	@Override
	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
}
