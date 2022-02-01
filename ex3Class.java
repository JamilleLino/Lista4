package Lista4;

public class ex3Class {
	
	String nome;
	int idade;
	String cpf;
	int quarto;
		
	
	public void informarnome()
	{
		System.out.println("Nome: "+this.nome);
	}
	
	public void informaridade()
	{
		System.out.println("Idade: "+this.idade);
	}
	
	public void informarcpf()
	{
		if(this.cpf.length()==14)
			System.out.println("cpf: "+this.cpf);
		else
			System.out.println("por favor digite o cpf corretamente 14 dígitos");
	}
	
	public void informarquarto()
	{
		System.out.println("O quarto do paciente é: "+this.quarto);
	}
	
}