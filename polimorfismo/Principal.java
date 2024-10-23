package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Horista horista = new Horista();
		System.out.println("Salário Bruto");
		System.out.println(horista.calcularSalario(35, 10));
		
		Jornada jornada = new Jornada();
		System.out.println("Salário Jornada");
		System.out.println(jornada.calcularSalario(150, 20));
		
		PessoaJuridica Pj = new PessoaJuridica();
		System.out.println("Salário Consultor PJ");
		System.out.println(Pj.calcularSalario(10000.0, 1000));
	}

}
