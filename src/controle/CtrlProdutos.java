package controle;

import dominio.Bebida;
import dominio.Fornecedor;
import dominio.Prato;
import dominio.Produto;

public class CtrlProdutos {
	private Produto[] vetorP;

	public CtrlProdutos() {
		vetorP = new Produto[3];
	}

	public String inserirPrato( String nome, float preço,
			boolean éSobremesa, Fornecedor fornecedor) {
		int i;
		for (i = 0; i < vetorP.length; i++) {
			if (vetorP[i] == null)
				break;
		}
		if (i >= vetorP.length)
			return "Vetor de Produtos lotado";

		vetorP[i] = new Prato(nome, preço, éSobremesa, fornecedor);
		return "Prato Inserido";
	}
	public String inserirBebida (String nome,float preco,String ano,Fornecedor fornecedor){
		int i;
		for (i = 0; i < vetorP.length; i++) {
			if (vetorP[i] == null)
				break;
		}
		if (i >= vetorP.length)
			return "Vetor de Produtos lotado";

		vetorP[i] = new Bebida(nome, preco, ano, fornecedor);
		return "Bebida Inserida";
	}

	public Produto getProduto(int codigo) {
		for (int i = 0; i < vetorP.length; i++) {
			if (vetorP[i] != null) {
				if (vetorP[i].getCodigo() == codigo)
					return vetorP[i];
			}
		}
		return null;
	}
}
