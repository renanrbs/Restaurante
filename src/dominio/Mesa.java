package dominio;

public class Mesa {
	private int numero;
	private static int proxNumero;
	private boolean ocupada = false;

	public Mesa() {
		proxNumero ++;
		this.numero = proxNumero;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
}
