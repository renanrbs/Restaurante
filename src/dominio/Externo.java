package dominio;

import java.sql.Time;

public class Externo extends Pedido {
	private Time horaSaida, horaChegada;
	private Cliente cliente;
	private Funcionario entregador;
	private Funcionario atendente;

	public Externo(Cliente cliente, Funcionario cozinheiro,
			Funcionario entregador, Funcionario atendente) {
		super(cozinheiro);
		this.cliente = cliente;
		this.entregador = entregador;
		this.atendente = atendente;

	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public Cliente getCliente() {
		return this.cliente;
	}

	@Override
	public Funcionario getEntregador() {
		return entregador;
	}

	@Override
	public Funcionario getAtendente() {
		return atendente;
	}

	public void setEntregador(Funcionario entregador) {
		this.entregador = entregador;
	}

	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}

	public Time getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Time horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Time getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(Time horaChegada) {
		this.horaChegada = horaChegada;
	}
}
