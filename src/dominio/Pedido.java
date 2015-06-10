package dominio;

public class Pedido {

	private int codigo;
	private static int proxCodigo = 0;
	private float preco;
	private Itens[] item;
	private Funcionario cozinheiro;

	public Pedido(Funcionario Funcionario) {
		proxCodigo++;
		this.codigo = proxCodigo;
		this.cozinheiro = Funcionario;
		this.item = new Itens[3];
	}

	public Funcionario getCozinheiro() {
		return cozinheiro;
	}

	public void setCozinheiro(Funcionario cozinheiro) {
		this.cozinheiro = cozinheiro;
	}

	public int getCodigo() {
		return codigo;
	}

	public String InserirItem(Itens item) {
		int i;
		for (i = 0; i < this.item.length; i++) {
			if (this.item[i] == null) {
				break;
			}
		}
		if (i >= this.item.length)
			return "vetor de itens lotado";

		this.item[i] = item;
		return "Item inserido";
	}

	public String getItens() {
		String produtos = "";
		for (int i = 0; i < this.item.length; i++) {
			if (this.item[i] != null) {
				produtos += this.item[i].getNome() + "\n";
			}
		}
		return produtos;
	}

	public float calcularPreço() {
		this.preco = 0;
		for (int i = 0; i < this.item.length; i++) {
			if (this.item[i] != null) {
				this.preco += item[i].calcularPreçoItem();
			}

		}
		return this.preco;

	}

	public Funcionario getGarçom() {
		return null;
	}

	public Funcionario getEntregador() {
		return null;
	}

	public Funcionario getAtendente() {
		return null;
	}

	public Mesa getMesa() {
		return null;
	}

	public Cliente getCliente() {
		return null;
	}
}
