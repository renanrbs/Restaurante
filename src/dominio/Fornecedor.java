package dominio;

public class Fornecedor {
	
	private String nome;
	private String telefone;
	private String endereço;
	private int codigo;
	
	public Fornecedor(int codigo,String nome, String telefone, String endereço){
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


}
