package dominio;

public class Cliente {
	private String nome, telefone, enderešo;
	private int codigo;

	public Cliente(int codigo, String nome, String telefone, String enderešo) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.enderešo = enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

}
