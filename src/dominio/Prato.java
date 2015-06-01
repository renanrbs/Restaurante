package dominio;

public class Prato extends Produto{
	private boolean eSobremesa;
	
	public Prato(String nome,float preÁo,boolean ÈSobremesa,Fornecedor fornecedor){
		super(nome,preÁo,fornecedor);
		this.eSobremesa = ÈSobremesa;
	}

	public boolean ÈSobremesa() {
		return eSobremesa;
	}

	public void setESobremesa(boolean eSobremesa) {
		this.eSobremesa = eSobremesa;
	}

	
}
