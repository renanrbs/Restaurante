package dominio;

public class Fornecedor {
	
	private String nome;
	private String telefone;
	private String enderešo;
	private int codigo;
	
	public Fornecedor(int codigo,String nome, String telefone, String enderešo){
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
