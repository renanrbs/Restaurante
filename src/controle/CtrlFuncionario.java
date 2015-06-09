package controle;

import dominio.Atendente;
import dominio.Cozinheiro;
import dominio.Entregador;
import dominio.Funcionario;
import dominio.Garçom;
import face.JanelaFuncionario;

public class CtrlFuncionario{

	private Funcionario[] vetorF;
	private Programa parente;
	
	public CtrlFuncionario(Programa parente) {
		vetorF = new Funcionario[5];
		this.parente = parente;
	}

	public String inserirFuncionario(String nome,
			String data, String telefone, String endereco, String funcao) {
		int i;
		for (i = 0; i < vetorF.length; i++) {
			if (vetorF[i] == null) 
				break;
		}
		if (i >= vetorF.length)
			return "Vetor de Funcionarios lotado";
		switch (funcao.toLowerCase()) {
		case "atendente":
			vetorF[i] = new Atendente(nome, data, telefone,
					endereco);
			break;
		case "entregador":
			vetorF[i] = new Entregador(nome, data, telefone,
					endereco);
			break;
		case "cozinheiro":
			vetorF[i] = new Cozinheiro(nome,  data, telefone,
					endereco);
			break;
		case "garçom":
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
	
	public void AbrirJanela(){
		JanelaFuncionario janela = new JanelaFuncionario(this);
		janela.setVisible(true);
	}
	
	public void Voltar(){
		parente.Voltar();
	}

}
