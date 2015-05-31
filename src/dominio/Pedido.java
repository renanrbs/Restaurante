package dominio;

public class Pedido {

	private int codigo;
	private Produto[] produto;
	private Funcionario cozinheiro;

	public Pedido(int codigo, Funcionario Funcionario) {
		this.codigo = codigo;
		this.cozinheiro = Funcionario;
		this.produto = new Produto[3];
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

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void InserirProduto(Produto produto) {
		for (int i = 0; i < this.produto.length; i++) {
			if (this.produto[i] == null) {
				this.produto[i] = produto;
				break;
			}
		}
	}

	public String getProdutos() {
		String produtos = "";
		for (int i = 0; i < this.produto.length; i++) {
			if (this.produto[i] != null) {
				produtos += this.produto[i].getNome() + "\n";
			}
		}
		return produtos;
	}

	public float calcularPreço() {
		float preço = 0;
		for (int i = 0; i < this.produto.length; i++) {
			if (this.produto[i] != null) {
				preço += produto[i].getPreço();
			}

		}
		return preço;

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
