package controle;

import dominio.Atendente;
import dominio.Cozinheiro;
import dominio.Entregador;
import dominio.Funcionario;
import dominio.Garçom;

public class CtrlFuncionario{

	private Funcionario[] vetorF;

	public CtrlFuncionario() {
		vetorF = new Funcionario[10];
	}

	public String inserirFuncionario(char tipo, String nome, int matricula,
			String data, String telefone, String endereco, String funcao) {
		int i;
		for (i = 0; i < vetorF.length; i++) {
			if (vetorF[i] != null) {
				if (vetorF[i].getMatricula() == matricula)
					return "Funcionario ja existe";

			} else
				break;
		}
		if (i >= vetorF.length)
			return "Vetor de Funcionarios lotado";
		switch (tipo) {
		case 'a':
			vetorF[i] = new Atendente(nome, matricula, data, telefone,
					endereco, funcao);
			break;
		case 'e':
			vetorF[i] = new Entregador(nome, matricula, data, telefone,
					endereco, funcao);
			break;
		case 'c':
			vetorF[i] = new Cozinheiro(nome, matricula, data, telefone,
					endereco, funcao);
			break;
		case 'g':
			vetorF[i] = new Garçom(nome, matricula, data, telefone, endereco,
					funcao);
			break;
		default:
			vetorF[i] = new Funcionario(nome, matricula, data, telefone,
					endereco, funcao);
			break;
		}

		return "Funcionario Inserido";
	}

	public Funcionario getFuncionario(int matricula) {
		for (int i = 0; i < vetorF.length; i++) {
			if (vetorF[i] != null) {
				if (vetorF[i].getMatricula() == matricula)
					return vetorF[i];
			}
		}
		return null;
	}

}
