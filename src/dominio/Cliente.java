package dominio;

public class Cliente {
	private String nome, telefone, endereço;
	private int codigo;
	private static int proxCodigo = 0;

	public Cliente(String nome, String telefone, String endereço) {
		proxCodigo ++;
		this.codigo = proxCodigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
	}

	public int getCodigo() {
		return codigo;
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
