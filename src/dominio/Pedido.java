package dominio;

public class Pedido {

	private int codigo;
	private static int proxCodigo = 0;
	private float preco;
	private Produto[] produto;
	private Funcionario cozinheiro;

	public Pedido(Funcionario Funcionario) {
		proxCodigo ++;
		this.codigo = proxCodigo;
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
		this.preco = 0;
		for (int i = 0; i < this.produto.length; i++) {
			if (this.produto[i] != null) {
				this.preco += produto[i].getPreço();
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
