package Lista4;

//Classe do meu cliente 
public class ex1Class {
	//Atributos
	String nome;
	int idade;
	String rg;
	String cpf;
		
	public void informarcpf()
	{
		if(this.cpf.length()==14)
			System.out.println("cpf: "+this.cpf);
		else
			System.out.println("por favor digite o cpf corretamente 14 dígitos");
	}
	
	public void informaridade()
	{
		System.out.println("Idade: "+this.idade);
	}
	
	public void informarnome()
	{
		System.out.println("Nome: "+this.nome);
	}
	
	public void informarrg()
	{
		if(this.rg.length()==7)
			System.out.println("Rg: "+this.rg);
		else
			System.out.println("por favor digite o rg corretamente 7 dígitos");
	}
}