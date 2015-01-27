import java.util.Scanner;

public class Cliente {
	
	private String nome;
	private String cpf;
	private float saldo;
	
	
	public Cliente() {
		
	
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	Scanner ler = new Scanner(System.in);
	
	
	public void cadastraCliente() {
		
		//Codigo Bruto Antes de utilizar Gui

        Cliente cliente = new Cliente();


        System.out.println("NOME: ");
        cliente.setNome(ler.nextLine());

        System.out.println("CPF: ");
        cliente.setCpf(ler.nextLine());

    }
	
	

}
