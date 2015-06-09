package controle;

import dominio.Fornecedor;
import face.JanelaFornecedor;

public class CtrlFornecedores {

	private Fornecedor[] vetorF;
	private Programa parente;

	public CtrlFornecedores(Programa parente) {
		this.parente = parente;
		vetorF = new Fornecedor[3];
	}

	public String inserirFornecedor(String nome, String telefone,
			String endereço) {
		int i;
		for (i = 0; i < vetorF.length; i++) {
			if (vetorF[i] == null)
				break;
		}
		if (i >= vetorF.length)
			return "Vetor de Fornecedores lotado";

		vetorF[i] = new Fornecedor(nome, telefone, endereço);
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

	public int getTVetorF() {
		return vetorF.length;
	}

	public void AbrirJanela() {
		JanelaFornecedor janela = new JanelaFornecedor(this);
		janela.setVisible(true);
	}

	public void Voltar() {
		parente.Voltar();
	}

}
