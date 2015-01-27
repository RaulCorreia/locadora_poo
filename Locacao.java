import java.util.Date;


public class Locacao {
	
	private Date dataLocacao;
	private Date dataEntrega;
	private float preco;
	private Produtos[] produto;
	
	public Locacao(Date dataLocacao, Date dataEntrega, float preco, Produtos[] produto){
		
		setDataLocacao(dataLocacao);
		setDataEntrega(dataEntrega);
		setPreco(preco);
		setProduto(produto);
		
		
	}

	public Date getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Produtos[] getProduto() {
		return produto;
	}

	public void setProduto(Produtos[] produto) {
		this.produto = produto;
	}
	
	
	
	

}
