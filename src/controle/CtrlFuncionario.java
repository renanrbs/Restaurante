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

	public String inserirFuncionario(char tipo, String nome,
			String data, String telefone, String endereco, String funcao) {
		int i;
		for (i = 0; i < vetorF.length; i++) {
			if (vetorF[i] == null) 
				break;
		}
		if (i >= vetorF.length)
			return "Vetor de Funcionarios lotado";
		switch (tipo) {
		case 'a':
			vetorF[i] = new Atendente(nome, data, telefone,
					endereco);
			break;
		case 'e':
			vetorF[i] = new Entregador(nome, data, telefone,
					endereco);
			break;
		case 'c':
			vetorF[i] = new Cozinheiro(nome,  data, telefone,
					endereco);
			break;
		case 'g':
			vetorF[i] = new Garçom(nome, data, telefone, endereco);
			break;
		default:
			vetorF[i] = new Funcionario(nome,  data, telefone,
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
