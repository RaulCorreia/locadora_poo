import java.util.LinkedList;
import java.util.List;


public class Pilha <Objeto>{
	
	private List<Objeto> objeto  = new LinkedList<Objeto>();
	
	
	
	public void push(Objeto objeto){
		
		this.objeto.add(objeto);
		
	}
	
	public Objeto pop(){
		
		return this.objeto.remove(0);
		
	}

	public boolean  isEmpty(){
		
		return this.objeto.size() == 0;
		
	}
	

}

