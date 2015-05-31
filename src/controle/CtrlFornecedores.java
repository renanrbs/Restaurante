package controle;

import dominio.Fornecedor;

public class CtrlFornecedores {

	private Fornecedor[] vetorF;

	public CtrlFornecedores() {
		vetorF = new Fornecedor[3];
	}

	public String inserirFornecedor(int codigo, String nome, String telefone,
			String endereço) {
		int i;
		for (i = 0; i < vetorF.length; i++) {
			if (vetorF[i] != null) {
				if (vetorF[i].getCodigo() == codigo)
					return "Fornecedor ja existe";

			} else
				break;
		}
		if (i >= vetorF.length)
			return "Vetor de Fornecedores lotado";

		vetorF[i] = new Fornecedor(codigo, nome, telefone, endereço);
		return "Fornecedor Inserido";
	}

	public Fornecedor getFornecedor(int codigo) {
		for (int i = 0; i < vetorF.length; i++) {
			if (vetorF[i] != null) {
				if (vetorF[i].getCodigo() == codigo)
					return vetorF[i];
			}
		}
		return null;
	}

}
