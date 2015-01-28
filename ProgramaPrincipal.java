import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;


public class ProgramaPrincipal extends JFrame implements ActionListener{
	
	private JPanel painelSuperior, painelInferior;
	private JButton butaoLocacao, butaoCadastroProd, butaoCadastroCliente;

	public ProgramaPrincipal(){
		super("Locadora de Livros e Cds");
		setSize(500,200);
		
		//Botoes Parte Superior
		butaoLocacao = new JButton ("Locação");
		butaoLocacao.addActionListener(this);
		butaoCadastroProd = new JButton ("Cad. Produtos");
		butaoCadastroProd.addActionListener(this);
		butaoCadastroCliente = new JButton ("Cad. Clientes");
		butaoCadastroCliente.addActionListener(this);
		//
		
		//Layout do Painel Superior Um ao Lado do Outro
		painelSuperior = new JPanel();
		painelSuperior.setLayout(new BoxLayout(painelSuperior, BoxLayout.X_AXIS));
		painelSuperior.add(butaoLocacao);
		painelSuperior.add(butaoCadastroProd);
		painelSuperior.add(butaoCadastroCliente);
		
		//Layout do Painel Inferior
		painelInferior = new JPanel();
		
		//Adicionado o Painel superior Na Parte de Cima do Container
		getContentPane().add(painelSuperior, BorderLayout.NORTH);
		getContentPane().add(painelInferior, BorderLayout.SOUTH);
		
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		
		Object source = evt.getSource();
		
		if (source == butaoLocacao){
			
		}
		
		if (source == butaoCadastroProd){
			
		}
		
		if (source == butaoCadastroCliente){
			
		}
		
	}
	
	
	public static void main (String [] args){
		
		ProgramaPrincipal teste = new ProgramaPrincipal();
		teste.setVisible(true);
		teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	
	
	

}
