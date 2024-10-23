package relacao;

public class PrincipalProfessor {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("Química");
		Professor professor1 = new Professor ("Ana", departamento);
		Professor professor2 = new Professor ("Henrique", departamento);
		
		professor1.exibirInfo();
		professor2.exibirInfo2();
		System.out.println("Departamento: " + departamento.getNome());
	}

}
