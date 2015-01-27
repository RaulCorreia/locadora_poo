import javax.swing.*;

public class ProgramaPrincipal extends JFrame{
	

	public ProgramaPrincipal(){
		setSize(400, 200);
		setTitle("- Locadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main (String [] args){
		
		ProgramaPrincipal teste = new ProgramaPrincipal();
		teste.setVisible(true);
		
		
	}
	

}
