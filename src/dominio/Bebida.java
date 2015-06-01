package dominio;


public class Bebida extends Produto{
	private String ano;
	
	public Bebida(String nome,float preco,String ano,Fornecedor fornecedor){
		super(nome,preco,fornecedor);
		this.ano = ano;
		
		
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

}
