package Lista4;

public class ex3 {

	public static void main(String[] args) {
		ex3Class cliente = new ex3Class();
		
		cliente.nome ="Antônio";
		cliente.idade =57;
		cliente.cpf ="839.835.253-54";
		cliente.quarto =7;
		
		cliente.informarnome();
		cliente.informaridade();
		cliente.informarcpf();
		cliente.informarquarto();
	}

}