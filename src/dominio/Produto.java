package dominio;

public class Produto {
	private int codigo;
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	private String nome;
	private float preço;
	Fornecedor fornecedor;

	public Produto(int codigo,String nome, float preço, Fornecedor fornecedor) {
		this.codigo = codigo;
		this.nome = nome;
		this.preço = preço;
		this.fornecedor = fornecedor;
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
