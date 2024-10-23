package polimorfismo;

public class Dentista extends ProfissionalSaude{
	
	private String cro;
	
	public Dentista() {}
	
	public Dentista (String nome, String especialidade, int valorConsulta, String cro) {
		super(nome, especialidade, valorConsulta);
		this.cro = cro;
	}
	
	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}
	
	@Override
	public void agendarConsulta() {
		System.out.println("Nome do dentista: " + nome + "| Especialidade: " + especialidade);
		System.out.println("CRO: " + cro + "Valor da consulta: " + valorConsulta);
	}
}
