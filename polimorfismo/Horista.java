package polimorfismo;

public class Horista extends Funcionario{
	public Horista() {}
	
	public Horista(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	
	@Override
	public double calcularSalario(double valorHora, double quantidadeHoras) {
		return valorHora * quantidadeHoras;
	}
}
