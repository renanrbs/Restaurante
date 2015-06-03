package dominio;

import java.sql.Time;

public class Externo extends Pedido {
	private Time horaSaida, horaChegada;
	private Cliente cliente;
	private Entregador entregador;
	private Atendente atendente;

	public Externo(Cliente cliente, Cozinheiro cozinheiro,
			Entregador entregador, Atendente atendente) {
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
	public Entregador getEntregador() {
		return entregador;
	}

	@Override
	public Atendente getAtendente() {
		return atendente;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}

	public void setAtendente(Atendente atendente) {
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
