package dominio;

public class Funcionario {
	private String nome;
	private int matricula;
	private String dataNascimento;
	private String telefone;
	private String endereco;
	private String funcao;

	public Funcionario(String nome, int matricula, String data,
			String telefone, String endereco, String funcao) {

		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = data;
		this.telefone = telefone;
		this.endereco = endereco;
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getData() {
		return dataNascimento;
	}

	public void setData(String data) {
		this.dataNascimento = data;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
