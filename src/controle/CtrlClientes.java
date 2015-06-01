package controle;

import dominio.Cliente;

public class CtrlClientes{


		private Cliente[] vetorC;

		public CtrlClientes() {
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

	

}
