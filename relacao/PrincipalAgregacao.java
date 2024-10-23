package relacao;

public class PrincipalAgregacao {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("RH");
		Empresa empresa = new Empresa ("Senai", departamento);
		
		empresa.exibirInfo();
	}
	
}
