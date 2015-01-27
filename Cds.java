
public class Cds extends Produtos{
	
	String nomeBanda;
	

	public Cds(String genero, int ano, boolean locado, boolean reservado, float preco, String nomeBanda, String titulo) {
		super(genero, ano, locado, reservado, preco, titulo);
		setNomeBanda(nomeBanda);
	}
	

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}
	
	
	

}
