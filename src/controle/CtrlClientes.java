package controle;

import dominio.Cliente;
import face.JanelaCliente;
import face.JanelaHome;

public class CtrlClientes{


		private Cliente[] vetorC;
		private Programa parente;

		public CtrlClientes(Programa parente) {
			this.parente = parente;
			vetorC = new Cliente[3];
		}

		public String inserirCliente(String nome, String telefone,
				String endereço) {
			int i;
			for (i = 0; i < vetorC.length; i++) {
				if (vetorC[i] == null) 
					break;
					
			}
			if (i >= vetorC.length)
				return "Vetor de Clientes lotado";

			vetorC[i] = new Cliente( nome, telefone, endereço);
			return "Cliente Inserido";
		}

		public Cliente getCliente(int codigo) {
			for (int i = 0; i < vetorC.length; i++) {
				if (vetorC[i] != null) {
					if (vetorC[i].getCodigo() == codigo)
						return vetorC[i];
				}
			}
			return null;
		}
		
		public void AbrirJanela(){
			JanelaCliente janela = new JanelaCliente(this);
			janela.setVisible(true);
		}
		
		public void Voltar(){
			parente.Voltar();
		}
	

}
