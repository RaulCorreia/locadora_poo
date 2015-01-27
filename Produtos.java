
public class Produtos {
	
	private String genero;
	private int ano;
	private boolean locado;
	private boolean reservado;
	private float preco;
	private String titulo;
	
	public Produtos(String genero, int ano, boolean locado, boolean reservado, float preco, String titulo) {
		
		setGenero(genero);
		setAno(ano);
		setLocado(locado);
		setReservado(reservado);
		setPreco(preco);
		setTitulo(titulo);
		
	}


	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		
		do
			
			if (ano > 1900){
				this.ano = ano;
				
			} else {
				
				//Gera mensagem
			}
		while (ano < 1900);
		
	}

	public boolean isLocado() {
		return locado;
	}

	public void setLocado(boolean locado) {
		this.locado = locado;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public float getPreco() {		
		return preco;
	}

	public void setPreco(float preco) {
		do{
			
			if(preco > 0){
				
				this.preco = preco;
				
			} else{
				
				//mensagem
			}
			
		} while(preco < 0);
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	

}
