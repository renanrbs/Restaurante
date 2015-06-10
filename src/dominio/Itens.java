package dominio;

public class Itens {
private int qtd = 1;
private Produto produto;

public Itens(Produto produto){
	this.produto = produto;
}

public float calcularPreçoItem() {
	return produto.getPreço() * qtd;
}

public String getNome(){
	return qtd + " " + produto.getNome();
}

public int getQtd() {
	return qtd;
}

public void setQtd(int qtd) {
	this.qtd = qtd;
}

}
