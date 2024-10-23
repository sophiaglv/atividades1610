package polimorfismo;

public class Fisioterapeuta extends ProfissionalSaude{
	
	private String crefito;
	
	public Fisioterapeuta() {}
	
	public Fisioterapeuta (String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
	}
	
	public String getCrm() {
		return crefito;
	}

	public void setCrm(String crefito) {
		this.crefito = crefito;
	}
	
	@Override
	public void agendarConsulta() {
		System.out.println("Nome do médico: " + nome + "| Especialidade: " + especialidade);
		System.out.println("CREFITO: " + crefito + "| Valor da consulta: " + valorConsulta);
	}
}
