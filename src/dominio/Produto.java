package dominio;

public class Produto {
	private int codigo;
	private static int proxcodigo = 0;

	private String nome;
	private float preço;
	Fornecedor fornecedor;

	public Produto(String nome, float preço, Fornecedor fornecedor) {
		proxcodigo ++;
		this.codigo = proxcodigo;
		this.nome = nome;
		this.preço = preço;
		this.fornecedor = fornecedor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

}
